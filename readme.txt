1. Run LocusApplication.java
2. paste the link in your browser to see database (http://localhost:9000/h2)
3. Sample data is already inserted using file data.sql (/locus/src/main/resources/data.sql)

4. Below are the required APIs (Check out folder : /locus/src/main/java/com/locus/assignment/controller)

i. Curl for assign Role

curl -X GET \
     'http://localhost:9000/userrole/assign?userId=3&roleId=2' \
     -H 'Authorization: Basic bWF5YW5rOmNyQHp5bUBydmVs' \
     -H 'Postman-Token: 86df3d94-fb29-452d-97cf-4b199d4da660' \
     -H 'cache-control: no-cache'

ii.  Curl for unassign role

curl -X GET \
      'http://localhost:9000/userrole/unassign?userId=3&roleId=2' \
      -H 'Authorization: Basic bWF5YW5rOmNyQHp5bUBydmVs' \
      -H 'Postman-Token: 86df3d94-fb29-452d-97cf-4b199d4da660' \
      -H 'cache-control: no-cache'

iii. Curl to check if resource is accessible

curl -X GET \
     'http://localhost:9000/resourceaccess/isallowed?resourceId=5&userId=3&actionId=1' \
     -H 'Postman-Token: 12919186-a0ae-4ba1-be9f-e531761ddb91' \
     -H 'cache-control: no-cache'

