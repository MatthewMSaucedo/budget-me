import React, { useState, useEffect } from "react";
import "./Dashboard.css";
import api from "../Api";
import axios from "axios";

const Dashboard = () => {
  const [expensebudgets, setExpenseBudgets] = useState([]);
  const [chargeAmt, setChargeAmt] = useState(0);

  function listExpenseBudget() {
    return fetch(api.listExpenseBudget).then(res => {
      if (!res.ok) {
        throw new Error("ListExpenseBudget response was not ok");
      }
      return res.json().then(expensebudgets => expensebudgets);
    });
  }

  function charge(expense) {
    return axios.post(api.charge, {
      expenseBudget: expense,
      cost: chargeAmt
    });
  }

  useEffect(() => {
    listExpenseBudget().then(_expenseBudgets =>
      setExpenseBudgets(_expenseBudgets)
    );
  }, []);

  const handleSubmit = expense => async event => {
    event.preventDefault();

    // TODO: API call to charge
    await charge(expense);

    // Update expense budget
    listExpenseBudget().then(_expenseBudgets =>
      setExpenseBudgets(_expenseBudgets)
    );
  };

  return (
    <>
      <div className="dashboard-header">
        <span className="dashboard-title">budget-me</span>
      </div>
      <div className="dashboard-body">
        {expensebudgets.map(expenseBudget => {
          return (
            <div key={expenseBudget.id} className="expense-budget">
              <div className="expense-budget-title">
                {expenseBudget.expenseType}
              </div>
              <div className="expense-budget-body">
                <div className="expense-budget-body-item">
                  <span>total</span>
                  <span>{expenseBudget.total}</span>
                </div>
                <div className="expense-budget-body-item">
                  <span>remaining</span>
                  <span>{expenseBudget.remaining}</span>
                </div>
                <div className="expense-budget-body-item">
                  <span>Charge</span>
                  <form onSubmit={handleSubmit(expenseBudget)}>
                    <input
                      id={expenseBudget.id}
                      className="input-width"
                      type="number"
                      onChange={e => setChargeAmt(e.target.value)}
                    />
                  </form>
                </div>
              </div>
            </div>
          );
        })}
      </div>
    </>
  );
};

export default Dashboard;
