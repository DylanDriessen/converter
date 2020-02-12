package com.example.imageToPDF.model;

public class imageDetails {
    private String dpiX;
    private String dpiY;
    private String scalingAlgorithm;
    private String pageSize;
    private String orientation;
    private String marginTop;
    private String marginLeft;
    private String marginRight;
    private String marginBottom;
    private String centered;
    private String printSizeType;
    private String printSizeWidth;
    private String printSizeHeight;
    private String printSizeAspectRatio;

    public imageDetails(String dpiX, String dpiY, String scalingAlgorithm, String pageSize, String orientation, String marginTop, String marginLeft, String marginRight, String marginBottom, String centered, String printSizeType, String printSizeWidth, String printSizeHeight, String printSizeAspectRatio) {
        this.dpiX = dpiX;
        this.dpiY = dpiY;
        this.scalingAlgorithm = scalingAlgorithm;
        this.pageSize = pageSize;
        this.orientation = orientation;
        this.marginTop = marginTop;
        this.marginLeft = marginLeft;
        this.marginRight = marginRight;
        this.marginBottom = marginBottom;
        this.centered = centered;
        this.printSizeType = printSizeType;
        this.printSizeWidth = printSizeWidth;
        this.printSizeHeight = printSizeHeight;
        this.printSizeAspectRatio = printSizeAspectRatio;
    }

    public String getDpiX() {
        return dpiX;
    }

    public void setDpiX(String dpiX) {
        this.dpiX = dpiX;
    }

    public String getDpiY() {
        return dpiY;
    }

    public void setDpiY(String dpiY) {
        this.dpiY = dpiY;
    }

    public String getScalingAlgorithm() {
        return scalingAlgorithm;
    }

    public void setScalingAlgorithm(String scalingAlgorithm) {
        this.scalingAlgorithm = scalingAlgorithm;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(String marginTop) {
        this.marginTop = marginTop;
    }

    public String getMarginLeft() {
        return marginLeft;
    }

    public void setMarginLeft(String marginLeft) {
        this.marginLeft = marginLeft;
    }

    public String getMarginRight() {
        return marginRight;
    }

    public void setMarginRight(String marginRight) {
        this.marginRight = marginRight;
    }

    public String getMarginBottom() {
        return marginBottom;
    }

    public void setMarginBottom(String marginBottom) {
        this.marginBottom = marginBottom;
    }

    public String getCentered() {
        return centered;
    }

    public void setCentered(String centered) {
        this.centered = centered;
    }

    public String getPrintSizeType() {
        return printSizeType;
    }

    public void setPrintSizeType(String printSizeType) {
        this.printSizeType = printSizeType;
    }

    public String getPrintSizeWidth() {
        return printSizeWidth;
    }

    public void setPrintSizeWidth(String printSizeWidth) {
        this.printSizeWidth = printSizeWidth;
    }

    public String getPrintSizeHeight() {
        return printSizeHeight;
    }

    public void setPrintSizeHeight(String printSizeHeight) {
        this.printSizeHeight = printSizeHeight;
    }

    public String getPrintSizeAspectRatio() {
        return printSizeAspectRatio;
    }

    public void setPrintSizeAspectRatio(String printSizeAspectRatio) {
        this.printSizeAspectRatio = printSizeAspectRatio;
    }
}
