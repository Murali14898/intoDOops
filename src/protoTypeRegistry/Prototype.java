package protoTypeRegistry;
@FunctionalInterface
public interface Prototype<T> {
    T copy();
}
