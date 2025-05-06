package com.ecom.app.payload;
import java.util.List;
public class ProductResponse {
    private List<ProductDTO> content;

    public ProductResponse(List<ProductDTO> content) {
        this.content = content;
    }

    public ProductResponse() {

    }

    public List<ProductDTO> getContent() {
        return content;
    }

    public void setContent(List<ProductDTO> content) {
        this.content = content;
    }
}
