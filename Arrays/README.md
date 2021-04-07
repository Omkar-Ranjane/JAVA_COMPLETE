An array is a collection of similar types of data.

For example, if we want to store the names of 100 people then we can create an array of the string type that can store 100 names.

```sh
> String[] array = new String[100];
```
Here, the above array cannot store more than 100 names. The number of values in a Java array is always fixed.

## How to declare an array in Java?
In Java, here is how we can declare an array.

```sh
> dataType[] arrayName;
```
dataType - it can be primitive data types like int, char, double, byte, etc. or Java objects
arrayName - it is an identifier
For example,
```sh
> double[] data;
```
Here, data is an array that can hold values of type double.

### how many elements can array this hold?
To define the number of elements that an array can hold, we have to allocate memory for the array in Java. For example,
```sh
// declare an array
double[] data;

// allocate memory
data = new Double[10];
```
Here, the array can store 10 elements. We can also say that the size or length of the array is 10.

In Java, we can declare and allocate memory of an array in one single statement. For example,
```sh
> double[] data = new double[10];
```
## MULTIDIMENSIONAL ARRAY
A multidimensional array is an array of arrays. Each element of a multidimensional array is an array itself. For example,
```sh
> int[][] a = new int[3][4];
```
Here, we have created a multidimensional array named a. It is a 2-dimensional array, that can hold a maximum of 12 elements,
![multidimensional array](https://cdn.programiz.com/sites/tutorial2program/files/java-2d-array.jpg)

### Initialize multidimensional array
```sh
int[][] a = {
      {1, 2, 3}, 
      {4, 5, 6, 9}, 
      {7}, 
};
```
![initialization multidimensional array](https://cdn.programiz.com/sites/tutorial2program/files/2d-array-variable-length.jpg)

