public class Matrix

{

public static void main(String[] args)

{

int array[][]={{1,3,4},{2,4,3},{3,4,5}};
System.out.println("Matrix");
for (int i = 0; i < 3; i++)
{
for (int j = 0; j < 3; j++)
{
System.out.print(array[i][j] + " ");
}
System.out.print("\n");
}

// to print the inverse of matrix array
System.out.println("Inverse of Matrix");
for (int i = 0; i < 3; i++)
{
for (int j = 0; j < 3; j++)
{
System.out.print(array[j][i] + " ");
}
System.out.print("\n");
}

}

}