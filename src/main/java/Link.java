public class Link {
    // Member variables
    int x;
    int y;
    boolean invincible;

    short invincible_counter;


    // Implement your Link class here
    Link(){
        x = 0; 
        y = 0;
        invincible = false;
        invincible_counter = 0;
    }
    
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }

    boolean isInvincible(){
        return invincible;
    }

    boolean moveUp(){
        
        if(y<12){
            y++;
            if(invincible_counter < 4){
                invincible_counter++;
            }
            else{
                invincible = false;
                invincible_counter = 0;
            }
            return true;
        }
        return false;

    }
    boolean moveDown(){
        if(y>-12){
            y--;
            if(invincible_counter < 4){
                invincible_counter++;
            }
            else{
                invincible = false;
                invincible_counter = 0;
            }
            return true;
        }
        return false;
    }
    boolean moveRight(){
        if(x<12){
            x++;
            if(invincible_counter < 4){
                invincible_counter++;
            }
            else{
                invincible = false;
                invincible_counter = 0;
            }
            return true;
        }
        return false;
    }
    boolean moveLeft(){
        if(x>-12){
            x--;
            if(invincible_counter < 4){
                invincible_counter++;
            }
            else{
                invincible = false;
                invincible_counter = 0;
            }
            return true;
        }
        return false;
    }

    void powerUp(){
        invincible = true;
        invincible_counter = 0;
    }
    

}

