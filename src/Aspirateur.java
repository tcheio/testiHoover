public class Aspirateur {
    
    private int crdX;
    private int crdY;
    private int orientation;    // 0 = Nord 1 = Est 2 = Sud 3 = Ouest
    private int tailleX;
    private int tailleY;

    public Aspirateur(int x, int y, int orient, int tX, int tY){
        this.orientation = orient;
        this.tailleX = tX;
        this.tailleY = tY;
        if (x <= this.tailleX){
            this.crdX = x;
        }
        if (y <= this.tailleY){
            this.crdY = y;
        }

    }

    
    public int getX(){
        return this.crdX;
    }

    public int getY(){
        return this.crdY;
    }

    public int getOrientation(){
        return this.orientation;
    }

    public void setOrientation(int orient){
        this.orientation = orient;
    }

    public void Avance (){
        if (this.orientation == 0){
            this.crdY +=1;
        }
        else if (this.orientation == 1){
            this.crdX +=1;
        }
        else if (this.orientation == 2){
            this.crdY -=1;
        }
        else if (this.orientation == 3){
            this.crdX -=1;
        }

    }


    public void Rotation (String rot){
        if (rot.equals("D") && this.orientation == 3){
            setOrientation(0);
    }
        else if (rot.equals("G") && this.orientation == 0){
            setOrientation(3);
        }

        else if (rot.equals("D") && this.orientation >=0 && this.orientation != 3){
            setOrientation(this.orientation += 1);
        }

        else if (rot.equals("G") && this.orientation > 0){
            setOrientation(this.orientation -= 1);
        }
    }

    public String getStatut(){
    if (this.orientation == 0){
            return "L'aspirateur est orienté Nord en ("+this.getX()+","+this.getY()+")";
    }

    else if (this.orientation == 1){
        return "L'aspirateur est orienté Est en ("+this.getX()+","+this.getY()+")";
    }
    else if (this.orientation == 2){
        return "L'aspirateur est orienté Sud en ("+this.getX()+","+this.getY()+")";
    }

    else {
        return "L'aspirateur est orienté Ouest en ("+this.getX()+","+this.getY()+")";
    }
        //return null;
}
}
