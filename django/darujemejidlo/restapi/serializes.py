from django.contrib.auth.models import User, Group
from .models import Food
from rest_framework import serializers


class UserSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = User
        fields = ['url', 'username', 'email', 'groups']


class GroupSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = Group
        fields = ['url', 'name']


class FoodSerializer(serializers.ModelSerializer):
    class Meta:
        model = Food
        fields = ('pk', 'title', 'food_name', 'address', 'city', 'warranty', 'user', 'location', 'creation_date', 'image')