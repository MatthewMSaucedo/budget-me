import React, { useState, useEffect } from 'react';
import './Dashboard.css';
import api from '../Api'

const Dashboard = () => {
    const [expensebudgets, setExpenseBudgets] = useState([]);

    function listExpenseBudget() {
        return fetch(api.listExpenseBudget).then(res => {
            if (!res.ok) {
                throw new Error("API response was not ok");
            }
            //res.json().then(e => console.log(e));
            return res.json().then(expensebudgets => expensebudgets);
        })
        .catch();
    }

    useEffect(() => {
        listExpenseBudget()
            .then(_expenseBudgets => setExpenseBudgets(_expenseBudgets));
    }, []);

    return (
        <>
            <div className="Dashboard-header">
                <span className="Dashboard-title">budget-me</span>
            </div>
            <div>
            {expensebudgets.map(expenseBudget => {
                return (
                <div key={expenseBudget.id}>
                    <span>{expenseBudget.expenseType}</span>
                </div>
                );
            })}
            </div>
        </>
    );
}

export default Dashboard;
