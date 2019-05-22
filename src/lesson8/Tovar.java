package lesson8;


public class Tovar {
    private String nameColour;
    private String colourId;
    private boolean available;
    private int idTovara;
    private String nameTovara;
    private int fixPrice;
    private int discount;
    private String type;
    private Characteristic[] characteristics = new Characteristic[20];
    private Comments[] comments = new Comments[1000];

    public String getNameColour() {
        return nameColour;
    }

    public void setNameColour(String nameColour) {
        this.nameColour = nameColour;
    }

    public String getColourId() {
        return colourId;
    }

    public void setColourId(String colourId) {
        this.colourId = colourId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getIdTovara() {
        return idTovara;
    }

    public void setIdTovara(int idTovara) {
        this.idTovara = idTovara;
    }

    public String getNameTovara() {
        return nameTovara;
    }

    public void setNameTovara(String nameTovara) {
        this.nameTovara = nameTovara;
    }

    public int getFixPrice() {
        return fixPrice;
    }

    public void setFixPrice(int fixPrice) {
        this.fixPrice = fixPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Characteristic[] getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characteristic[] characteristics) {
        this.characteristics = characteristics;
    }

    public Comments[] getComments() {
        return comments;
    }

    public void setComments(Comments[] comments) {
        this.comments = comments;
    }

    public void addCharacteristic(Characteristic characteristic) {
        for (int i = 0; i < characteristics.length; i++) {
            if (characteristics == null) {
                characteristics[i] = characteristic;
                return;
            }
        }

    }

    public void addComments(Comments comment) {
        for (int i = 0; i < comments.length; i++) {
            if (comments[i] == null) {
                comments[i] = comment;
                return;
            }
        }

    }

    public void printInfo() {
        System.out.printf("Товар: имя - %s, цена - %d, скидка - %d, тип - %s", nameTovara, fixPrice, discount, type);
        System.out.println();
        for (Characteristic h : characteristics) {
            if (h != null) {
                System.out.println();
                System.out.println(h.getKey() + ":" + h.getValue());
            }
        }
        for (Comments o : comments){
            if(o!=null){
                System.out.println("Отзыв от: " + o.getComment() + ", рейтинг отзыва:" + o.getRating());
            }
        }
    }
}
