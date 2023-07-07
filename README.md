# Library-Management-System-With-java-

<!DOCTYPE html>
<html>
<head>
    
</head>
<body>
    <h1>Library Management System</h1>
    <p>Hello! My name is Tanu Sharma, I am a 4th-year Undergraduate Student currently studying at the Indian Institute of Technology, Kharagpur. I have developed this Library Management System Project.This is a simple library management system implemented in Java. It allows users to add books, issue books, return books, and print complete issue information.</p>
    <h2>Usage</h2>
    <ol>
        <li>Run the program.</li>
        <li>Choose from the available options:</li>
        <ul>
            <li><strong>Press 1 to Add book:</strong> Add a book by providing its name, price, and ID.</li>
            <li><strong>Press 2 to Issue book:</strong> Issue a book by entering its name, ID, issue date, total number of books issued, and return date.</li>
            <li><strong>Press 3 to Return Book:</strong> Return a book by entering its name and ID. The program will display the details of the book if the ID matches the issued book's ID.</li>
            <li><strong>Press 4 to print complete issue information:</strong> Print the details of the issued book.</li>
            <li><strong>Press 5 to exit:</strong> Exit the program.</li>
        </ul>
        <li>Follow the prompts to complete the selected operation.</li>
        <li>After completing an operation, you will be prompted to select another option or exit the program.</li>
    </ol>
    <h2>Code Explanation</h2>
    <p>The program consists of two classes: <code>LibraryProject</code> and <code>Library</code>.</p>
    <h3>LibraryProject Class</h3>
    <p>The <code>LibraryProject</code> class contains the main method and is responsible for handling user input and executing the corresponding methods in the <code>Library</code> class based on the selected option.</p>
    <h3>Library Class</h3>
    <p>The <code>Library</code> class represents the library and contains methods for adding a book, issuing a book, returning a book, printing book details, and exiting the program.</p>
    <ul>
        <li><code>add()</code>: Prompts the user to enter the book's name, price, and ID, and displays the book's details.</li>
        <li><code>issue()</code>: Asks the user to enter the details of the issued book, including name, ID, issue date, total number of books issued, and return date.</li>
        <li><code>getid()</code>: Returns the ID of the issued book.</li>
        <li><code>returnBook()</code>: Prompts the user to enter the details of the returned book, including name and ID. If the entered ID matches the ID of the issued book, it displays the complete details of the issued book; otherwise, it shows an error message.</li>
        <li><code>details()</code>: Prints the details of the issued book.</li>
        <li><code>exit()</code>: Exits the program.</li>
    </ul>
    <h2>Customization</h2>
    <ul>
        <li>Feel free to enhance the program by adding more features or error handling based on your requirements.</li>
    </ul>
    <p>Please note that this is a basic implementation for educational purposes and may not include all the functionalities and edge cases required in a comprehensive library management system.</p>
</body>
</html>
