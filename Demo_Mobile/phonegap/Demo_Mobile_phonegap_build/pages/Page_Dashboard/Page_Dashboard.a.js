dojo.declare("Page_Dashboard", wm.Page, {
"preferredDevice": "desktop",
start: function() {
},
_end: 0
});

Page_Dashboard.widgets = {
layoutBox1: ["wm.Layout", {"horizontalAlign":"left","verticalAlign":"top"}, {}, {
dashboard1: ["wm.Dashboard", {"hasResizableColumns":true,"margin":"4","portlets":[{"id":"portlet","title":"Annuaire","page":"Page_Annuaire","isOpen":true,"isClosable":true,"x":0,"y":0},{"id":"portlet_1","title":"Client","page":"Page_Client","isOpen":true,"isClosable":true,"x":1,"y":0}]}, {}]
}]
};

Page_Dashboard.prototype._cssText = '';
Page_Dashboard.prototype._htmlText = '';