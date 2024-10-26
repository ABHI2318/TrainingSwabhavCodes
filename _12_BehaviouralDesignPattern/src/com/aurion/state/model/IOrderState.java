package com.aurion.state.model;

public interface IOrderState {
 

public void printstatus();
public void next(OrderContext orderContext);
public void previous(OrderContext orderContext);
}
