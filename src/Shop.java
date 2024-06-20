public class Shop {
    Lock lock = new Lock();

    public void shopStatus(){
        if(lock.isLocking()){
            System.out.println("Shop closed");
        } else{
            System.out.println("Shop open");
        }
    }

    public Lock getLock(){
        return lock;
    }

    class Lock{
        private boolean locking = true;

        public boolean isLocking(){
            return locking;
        }

        public void setLocking(boolean locking){
            this.locking = locking;
        }
    }
}
