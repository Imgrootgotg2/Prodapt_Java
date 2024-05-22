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