# Get hello world page
`curl http://localhost:8080`

# Get bread page
`curl http://localhost:8080/bread`

![image](https://github.com/user-attachments/assets/54ed4b8b-8621-4861-943e-b9c5c49744e8)

# Delete a bread
`curl -X DELETE http://localhost:8080/bread/Grilled%20Cheese%20Sandwich`

![image](https://github.com/user-attachments/assets/cdcc7d5f-6ae5-4e9a-87ba-406815c96ea6)

# Create a bread
`curl -X POST http://localhost:8080/bread -H "Content-Type: application/json" -d '{"name":"Doughnut","numIngredients":20}'`

![image](https://github.com/user-attachments/assets/e0637153-d974-4dad-a4e4-f63a48d912dc)
