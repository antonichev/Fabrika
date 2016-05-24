package ua.od.fabrika.antonichev.HW9;

/**
 * Описать класс «vector_3d» (т.е. он должен описывать вектор в 3-х мерной, декартовой системе коорднат)
 * В качестве свойств этого класса возьмите координаты вектора. Для этого класса реализовать методы сложения,
 * и скалярного и векторного произведения векторов. Создайте несколько объектов этого класса и протестируйте их.
*/
public class HW9_task7_Vector3D {
    public static void main(String[] args) {
        Vector3D vectorA = new Vector3D(10, 15, 10);
        Vector3D vectorB = new Vector3D(20, 10, 15);

        vectorA.scalar_multiplication(vectorB);
        vectorA.sum(vectorB);
        vectorA.vector_multiplication(vectorB);
    }
}

class Vector3D{
    public int x;
    public int y;
    public int z;

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void scalar_multiplication(Vector3D vector){
        System.out.println("Result of scalar multiplication: " + (this.x * vector.x + this.y * vector.y + this.z * vector.z));
    }

    public void vector_multiplication(Vector3D vector){ //(a2b3-a3b2, a3b1-a1b3, a1b2-a2b1)
        System.out.println("Result of vector multiplication: X(" +
                (this.y * vector.z - this.z * vector.y) + "; " +
                (this.z * vector.x - this.x * vector.z) + "; " +
                (this.x * vector.y - this.y * vector.x) + ")");
    }

    public void sum(Vector3D vector){
        System.out.println("Sum of vectors: X(" + (this.x + vector.x) + "; " + (this.y + vector.y) + "; " + (this.z + vector.z) + ")");
    }
}