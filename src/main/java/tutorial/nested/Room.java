package tutorial.nested;

public class Room {
    private int length;
    private int width;
    private int height;

    @Override
    public String toString() {
        return "Room{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Room() {
    }

    public Room(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    static  class Bathroom{
        private int bLength;
        private int bWidth;
        private int bHeight;

        @Override
        public String toString() {
            return "Bathroom{" +
                    "bLength=" + bLength +
                    ", bWidth=" + bWidth +
                    ", bHeight=" + bHeight +
                    '}';
        }

        public int getbLength() {
            return bLength;
        }

        public void setbLength(int bLength) {
            this.bLength = bLength;
        }

        public int getbWidth() {
            return bWidth;
        }

        public void setbWidth(int bWidth) {
            this.bWidth = bWidth;
        }

        public int getbHeight() {
            return bHeight;
        }

        public void setbHeight(int bHeight) {
            this.bHeight = bHeight;
        }

        public Bathroom() {
        }

        public Bathroom(int bLength, int bWidth, int bHeight) {
            this.bLength = bLength;
            this.bWidth = bWidth;
            this.bHeight = bHeight;
        }
    }
}
