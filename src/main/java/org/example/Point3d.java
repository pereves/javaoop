package org.example;

public class Point3d {
    double x;
    double y;
    double z;


    public Point3d() {
    }

    public Point3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * @return длину вектора
     */
    public double lenghtVector() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     *
     * @param b второй вектор
     * @return скалярное произведение
     */
    public double scalarMultiplay (Point3d b){
        return this.x*b.x+this.y*b.y+this.z*b.z;
    }

    /**
     *
     * @param PointC вторая точка
     * @return векторное произведение с другим вектором
     */
    public Point3d multi (Point3d PointC){
        return new Point3d(y*PointC.z-z*PointC.y, z*PointC.x - x*PointC.z, x*PointC.y-y*PointC.y);
    }

    public double cosTriangle(Point3d PointC){
        return this.scalarMultiplay(PointC)/(lenghtVector()*PointC.lenghtVector());
    }


}