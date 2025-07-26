package PracticeSet.atlaslearnings.day21;

 class Clothes1 {
    void seeRating() {
    }
    void viewSample() {
    }
}
 class Cupboard {
    Clothes cobj;
    void addClothes(Clothes cobj) {
    }
    void CustomizeClothes() {
    }
}
  abstract class Books1 {
    void seeRating() {
    }
    void readSample() {
    }
}

interface IProduct {
    void SeeReviews();
    void getSample();
}
 class Clothes implements IProduct {
    @Override
    public void SeeReviews() {

    }
    @Override
    public void getSample() {

    }
}
 class Books implements IProduct {
    @Override
    public void SeeReviews() {

    }
    @Override
    public void getSample() {

    }
}
