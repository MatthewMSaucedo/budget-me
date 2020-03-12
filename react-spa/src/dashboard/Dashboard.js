import React, { useState, useEffect } from 'react';
import './Dashboard.css';
import api from '../Api'

const Dashboard = () => {
    const [hasError, setErrors] = useState(false);
    const [expensebudgets, setExpenseBudgets] = useState({});

    async function listExpenseBudget() {
        const res = await fetch(api.listExpenseBudget)
        res.json()
            .then(res => setExpenseBudgets(res))
            .catch(error => setErrors(error));
    }

    useEffect(() => {
        listExpenseBudget();
    }, []);

    return (
        <div className="Dashboard-header">
            <span class="Dashboard-title">budget-me</span>
            <div>
                <span> {JSON.stringify(expensebudgets)} </span>
                <hr />
                <span>Has error: {JSON.stringify(hasError)} </span>
            </div>
        </div>
    );
}

export default Dashboard;
