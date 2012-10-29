dojo.declare("Main", wm.Page, {
start: function() {
},
"preferredDevice": "desktop",
_end: 0
});

Main.widgets = {
variable1: ["wm.Variable", {"isList":true,"json":"[{name: \"Sunday\", dataValue: 0}, {name: \"Monday\", dataValue: 1},{name: \"Tuesday\", dataValue: 2},{name: \"Wednesday\", dataValue: 3},{name: \"Thursday\", dataValue: 4},{name: \"Friday\", dataValue: 5},{name: \"Saturday\", dataValue: 6}]","type":"EntryData"}, {}],
notificationCall1: ["wm.NotificationCall", {}, {}, {
input: ["wm.ServiceInput", {"type":"alertInputs"}, {}]
}],
layoutBox1: ["wm.Layout", {"horizontalAlign":"left","verticalAlign":"top"}, {}, {
toggleButtonPanel1: ["wm.ToggleButtonPanel", {"desktopHeight":"30px","height":"30px","horizontalAlign":"left","manageHistory":true,"manageURL":true,"margin":"0,1,0,0","mobileHeight":"30px","verticalAlign":"top"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"navButton1","targetProperty":"currentButton"}, {}]
}],
navButton1: ["wm.Button", {"border":"0,1,0,0","caption":"Annuaire","height":"100%","imageIndex":85,"imageList":"app.silkIconList","margin":"0","width":"100%"}, {"onclick":"layer1"}],
navButton2: ["wm.Button", {"border":"0,1,0,0","caption":"Client","height":"100%","imageIndex":54,"imageList":"app.silkIconList","margin":"0","width":"100%"}, {"onclick":"layer2"}],
navButton3: ["wm.Button", {"border":"0","borderColor":"#ABB8CF","caption":"Contacts","height":"100%","imageIndex":27,"imageList":"app.silkIconList","margin":"0","width":"100%"}, {"onclick":"layer3"}]
}],
layers1: ["wm.Layers", {"defaultLayer":0,"margin":"3,0,0,0","transition":"slide"}, {}, {
layer1: ["wm.Layer", {"borderColor":"","caption":"layer1","horizontalAlign":"left","layoutKind":"left-to-right","themeStyleType":"","verticalAlign":"top"}, {}, {
panel1: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
page_annuairePage: ["wm.PageContainer", {"deferLoad":true,"pageName":"Page_Annuaire","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
}]
}],
layer2: ["wm.Layer", {"borderColor":"","caption":"layer2","horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
pageContainer2: ["wm.PageContainer", {"border":"1","deferLoad":true,"margin":"4","pageName":"Page_Client","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
}],
layer3: ["wm.Layer", {"borderColor":"","caption":"layer3","horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
pageContainer3: ["wm.PageContainer", {"border":"1","deferLoad":true,"margin":"4","pageName":"Page_Contacts","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
}]
}]
}]
};

Main.prototype._cssText = '';
Main.prototype._htmlText = '';