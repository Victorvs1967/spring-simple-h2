CREATE TABLE IF NOT EXISTS users (
  id SERIAL PRIMARY KEY, 
  username VARCHAR(250), 
  password VARCHAR(250), 
  email VARCHAR(250)
);
