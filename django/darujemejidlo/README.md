## Install
```
cd /django/darujemejidlo
pip install -r requirements.txt
```

## Run localy
```
cd /django/darujemejidlo
python manage.py runserver
```
## Database changes

Update model class (Entity) and run following commands to update database

```
python manage.py makemigrations restapi
```
Output of pervious command:
```
Migrations for 'restapi':
  restapi/migrations/0001_initial.py
```
Use generated script:
```
python manage.py sqlmigrate restapi 0001
```
Apply migrations to database:
```
python manage.py migrate
```
