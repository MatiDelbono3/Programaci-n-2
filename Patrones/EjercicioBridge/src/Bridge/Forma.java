package Bridge;

public abstract class Forma {
    Color color=new Color() {
        @Override
        public void Aplicar() {
            super.Aplicar();
        }
    };
    public Forma (Color color) {
        this.color=color;
    }
    public  void Dibujar(){

    }

}
