package com.wonders.collection;

/**
 * @Description 看hashCode和equals如何重写
 * @Author huangweiyue
 * @Date Created in 2018-07-14 21:04
 * @ModifiedBy
 * @Version v1.0
 */
public class HashCodeAndEquals {
    private String carName;
    private String carColor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashCodeAndEquals that = (HashCodeAndEquals) o;

        if (carName != null ? !carName.equals(that.carName) : that.carName != null) return false;
        return carColor != null ? carColor.equals(that.carColor) : that.carColor == null;
    }

    @Override
    public int hashCode() {
        int result = carName != null ? carName.hashCode() : 0;
        result = 31 * result + (carColor != null ? carColor.hashCode() : 0);
        return result;
    }
}
