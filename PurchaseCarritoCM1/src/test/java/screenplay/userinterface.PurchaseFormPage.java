package screenplay;

import lombok.Getter;
@Getter
class userinterface

{
    /**
     *
     */
    private userinterface PurchaseFormPage;

    /**
     *
     */
    private void setPurchaseFormPage() {
        setPurchaseFormPage(null);
    }

    public void setPurchaseFormPage(userinterface purchaseFormPage) {
        PurchaseFormPage = purchaseFormPage;
    }
}