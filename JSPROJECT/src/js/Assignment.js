function addData() {
    // Get form input values
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var phone = document.getElementById("phone").value;
    var account_type = document.getElementById("account_type").value;

    // Create a new table row
    var table = document.getElementById("dataTable");
    var newRow = table.insertRow();

    // Insert cells into the row
    var cell1 = newRow.insertCell(0);
    var cell2 = newRow.insertCell(1);
    var cell3 = newRow.insertCell(2);
    var cell4 = newRow.insertCell(3);

    // Add data to the cells
    cell1.innerHTML = name;
    cell2.innerHTML = email;
    cell3.innerHTML = phone;
    cell4.innerHTML = account_type;
}

document.getElementById('myForm').addEventListener('submit', function(event) {
    // Prevent the default form submission
    event.preventDefault();

    // The form validation code goes here
    var name = document.getElementById('name').value;
    var email = document.getElementById('email').value;
    var phone = document.getElementById('phone').value;
    var accountType = document.getElementById('account_type').value;

    // Simple validation for required fields
    if (name.trim() === '' || email.trim() === '' || phone.trim() === '' || accountType === '') {
        alert('Please fill in all fields.');
        return false;
    }

    // Validation for name format
    var nameRegex = /^[a-zA-Z.\s]+$/;
    if (!nameRegex.test(name)) {
        alert('Please enter a valid name containing only letters, full stops and spaces.');
        return false;
    }

    // Validation for email format
    var emailRegex = /^\S+@\S+\.\S+$/;
    if (!emailRegex.test(email)) {
        alert('Please enter a valid email address.');
        return false;
    }

    // Validation for phone number format
    var phoneRegex = /^[789]\d{9}$/; // Phone number must start with 7, 8, or 9 and be 10 digits long
    if (!phoneRegex.test(phone)) {
        alert('Please enter a 10-digit phone number starting with 7, 8, or 9.');
        return false;
    }

    // Call the addData function to add the form data to the table
    addData();

    // Reset the form after submission
    document.getElementById('myForm').reset();
});