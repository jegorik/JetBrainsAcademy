class AsciiCharSequence implements CharSequence {
    byte[] storage;

    public AsciiCharSequence(byte[] storage) {
        this.storage = storage.clone();
    }

    @Override
    public int length() {
        return storage.length;
    }

    @Override
    public char charAt(int index) {
        return (char) storage[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(java.util.Arrays.copyOfRange(storage, start, end));
    }

    @Override
    public String toString() {
        return new String(storage);
    }
}