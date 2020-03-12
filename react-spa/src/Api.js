const apiUrl = 'http://budgetme-env.jixtdvdf7f.us-east-1.elasticbeanstalk.com/api/budget';

export default {
    charge: `${apiUrl}/charge`,
    listExpenseBudget: `${apiUrl}/listExpenseBudget`,
    createExpenseBudget: `${apiUrl}/createExpenseBudget`
}
