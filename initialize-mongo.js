// initialize-mongo.js

// Set up the admin credentials
var adminUsername = 'admin';
var adminPassword = 'example';

// Connect to the admin database
var adminDb = db.getSiblingDB('admin');

// Create the admin user with readWrite role on 'error-logs' database
adminDb.createUser({
    user: adminUsername,
    pwd: adminPassword,
    roles: [
        { role: 'readWrite', db: 'error-logs' }
    ]
});

// Output success message
print('Admin user created successfully.');
