ALTER TABLE events
ADD CONSTRAINT fk_events_users
FOREIGN KEY (user_id) REFERENCES users(id);

ALTER TABLE files
ADD CONSTRAINT fk_files_users
FOREIGN KEY (user_id) REFERENCES users(id);