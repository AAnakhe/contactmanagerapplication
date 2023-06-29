//// JavaScript code for the contact manager
//
//// Submit form using AJAX
//document.getElementById("addContactForm").addEventListener("submit", function(event) {
//    event.preventDefault(); // Prevent default form submission
//
//    var form = event.target;
//    var formData = new FormData(form);
//
//    // Send AJAX request to the server
//    fetch(form.action, {
//        method: form.method,
//        body: formData
//    })
//    .then(function(response) {
//        if (response.ok) {
//            // Clear form inputs on successful submission
//            form.reset();
//        } else {
//            throw new Error("Error submitting form: " + response.status);
//        }
//    })
//    .catch(function(error) {
//        console.error(error);
//    });
//});
//
//
//
//// Contact List Functionality
//window.addEventListener('DOMContentLoaded', () => {
//  // Get the contact table element
//  const contactTable = document.querySelector('.contact-list table');
//
//  // Attach event listener to each row for click handling
//  contactTable.addEventListener('click', (event) => {
//    // Check if the clicked element is a row
//    if (event.target.nodeName === 'TR') {
//      // Handle row click, e.g., open contact details, navigate to contact page, etc.
//      const contactId = event.target.dataset.contactId;
//      console.log(`Clicked contact with ID: ${contactId}`);
//    }
//  });
//});