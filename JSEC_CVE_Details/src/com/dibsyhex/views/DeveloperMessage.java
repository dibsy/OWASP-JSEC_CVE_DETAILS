package com.dibsyhex.views;

public class DeveloperMessage {
    private String jsecMessage = "https://www.owasp.org/index.php/OWASP_JSEC_CVE_Details";
    private String cveMessage = "www.cvedetails.com provides an easy to use web interface to CVE vulnerability data.\n  You can browse for vendors, products and versions and view cve entries, vulnerabilities,\n related to them. You can view statistics about vendors, products and versions of products.\n CVE details are displayed in a single, easy to use page";
    private String exploitMessage = "This site, www.exploitsearch.net, is an attempt at cross referencing/correlating exploits\nand vulnerability data from various sources and making the resulting database available to\neveryone.Unlike other exploit search engines which are simply custom google searches, this\nsite actually crawls the source dattabases/websites and parses the contained data. Once the\ndata is collected and parsed, it is inserted into the www.exploitsearch.net database and becomes\navailable for searching.";
    private String developer = "Developed by Dibyendu Sikdar\nhttps://twitter.com/dibsyhex\nhttps://github.com/dibsy";

    public String getExploitMessage() {
        return this.exploitMessage;
    }

    public void setExploitMessage(String exploitMessage) {
        this.exploitMessage = exploitMessage;
    }

    public String getJsecMessage() {
        return this.jsecMessage;
    }

    public void setJsecMessage(String jsecMessage) {
        this.jsecMessage = jsecMessage;
    }

    public String getCveMessage() {
        return this.cveMessage;
    }

    public void setCveMessage(String cveMessage) {
        this.cveMessage = cveMessage;
    }

    public String getDeveloper() {
        return this.developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}

