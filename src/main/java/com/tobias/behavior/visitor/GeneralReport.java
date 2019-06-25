package com.tobias.behavior.visitor;

public class GeneralReport implements Visitor{

  private int customerNO;
  private int orderNo;
  private int itemNo;
  @Override
  public void visit(Customer customer) {
    System.out.println("visit customer :: " + customer.getName());
    customerNO++;
  }

  @Override
  public void visit(Order order) {
    System.out.println("  visit order :: " + order.getName());
    orderNo++;
  }

  @Override
  public void visit(Item item) {
    System.out.println("    visit item :: " + item.getName());
    itemNo++;
  }

  public void displayResults() {
    System.out.println("customerNO : " + customerNO + " orderNo " + orderNo + " itemNo "  + itemNo);
  }
}
