Insert into Action(type, created_at, created_by, updated_at, updated_by, deleted) values('READ', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Action(type, created_at, created_by, updated_at, updated_by, deleted) values('WRITE', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Action(type, created_at, created_by, updated_at, updated_by, deleted) values('UPDATE', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Action(type, created_at, created_by, updated_at, updated_by, deleted) values('DELETE', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);

Insert into Resource(name, created_at, created_by, updated_at, updated_by, deleted) values('Resource1', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource(name, created_at, created_by, updated_at, updated_by, deleted) values('Resource2', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource(name, created_at, created_by, updated_at, updated_by, deleted) values('Resource3', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource(name, created_at, created_by, updated_at, updated_by, deleted) values('Resource4', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource(name, created_at, created_by, updated_at, updated_by, deleted) values('Resource5', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);

Insert into Role(name, created_at, created_by, updated_at, updated_by, deleted) values('ADMIN', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Role(name, created_at, created_by, updated_at, updated_by, deleted) values('EMPLOYEE', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Role(name, created_at, created_by, updated_at, updated_by, deleted) values('ROLE1', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Role(name, created_at, created_by, updated_at, updated_by, deleted) values('ROLE2', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);

Insert into User(username, created_at, created_by, updated_at, updated_by, deleted) values('Name1', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into User(username, created_at, created_by, updated_at, updated_by, deleted) values('Name2', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into User(username, created_at, created_by, updated_at, updated_by, deleted) values('Name3', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into User(username, created_at, created_by, updated_at, updated_by, deleted) values('Name4', '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);

Insert into User_Role(user_Id, role_Id, active, created_at, created_by, updated_at, updated_by, deleted) values(1, 1, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into User_Role(user_Id, role_Id, active, created_at, created_by, updated_at, updated_by, deleted) values(1, 2, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into User_Role(user_Id, role_Id, active, created_at, created_by, updated_at, updated_by, deleted) values(2, 3, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into User_Role(user_Id, role_Id, active, created_at, created_by, updated_at, updated_by, deleted) values(2, 4, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into User_Role(user_Id, role_Id, active, created_at, created_by, updated_at, updated_by, deleted) values(3, 4, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into User_Role(user_Id, role_Id, active, created_at, created_by, updated_at, updated_by, deleted) values(4, 2, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);

Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(1, 1, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(2, 1, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(3, 1, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(4, 1, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(5, 1, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(1, 1, 2, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(2, 1, 2, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(3, 1, 2, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(4, 1, 2, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(5, 1, 2, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(1, 1, 3, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(2, 1, 3, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(3, 1, 3, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(4, 1, 3, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(5, 1, 3, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(1, 1, 4, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(2, 1, 4, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(3, 1, 4, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(4, 1, 4, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(5, 1, 4, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(1, 2, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(2, 3, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(3, 4, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);
Insert into Resource_Access(resource_Id, role_Id, action_id, created_at, created_by, updated_at, updated_by, deleted) values(4, 5, 1, '2020-05-20 20:13:07',1, '2020-05-20 20:13:07', 1, FALSE);


