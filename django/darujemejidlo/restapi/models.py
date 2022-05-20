from django.db import models
from django.contrib.auth.models import User
from datetime import datetime



class Food(models.Model):
    title = models.CharField(max_length=200, default='')
    food_name = models.CharField(max_length=200, default='')
    location = models.CharField(max_length=200, default='')
    address = models.CharField(max_length=100, default='')
    city = models.CharField(max_length=50, default='')
    creation_date = models.DateTimeField(default=datetime.now, blank=True)
    warranty = models.BooleanField(default=False)
    user = models.ForeignKey(User, on_delete=models.CASCADE)
    active = models.BooleanField(default=True)
    image = models.CharField(max_length=200, default='')

    def __str__(self) -> str:
        return self.title

