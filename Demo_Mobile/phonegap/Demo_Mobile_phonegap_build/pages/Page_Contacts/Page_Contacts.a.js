dojo.declare("Page_Contacts", wm.Page, {
"i18n": true,
"preferredDevice": "desktop",
start: function() {
},
_end: 0
});

Page_Contacts.widgets = {
phoneGapCall_contact: ["wm.PhoneGapCall", {"autoUpdate":true,"startUpdate":true}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"layoutBox1","targetProperty":"loadingDialog"}, {}]
}],
input: ["wm.ServiceInput", {"type":"contacts_readInputs"}, {}]
}],
phoneGapCall_Camera: ["wm.PhoneGapCall", {"operation":"capture_picture"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"dojoGrid1","targetProperty":"loadingDialog"}, {}]
}],
input: ["wm.ServiceInput", {"type":"capture_pictureInputs"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":"\"Camera\"","targetProperty":"sourceType"}, {}]
}]
}]
}],
navigationCall_Mobile: ["wm.NavigationCall", {"operation":"gotoPage"}, {}, {
input: ["wm.ServiceInput", {"type":"gotoPageInputs"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":"\"Page_Mobile\"","targetProperty":"pageName"}, {}]
}]
}]
}],
layoutBox1: ["wm.Layout", {"horizontalAlign":"left","verticalAlign":"top"}, {}, {
dataNavigator1: ["wm.DataNavigator", {"border":"0","desktopHeight":"30px","enableTouchHeight":true,"height":"30px","minWidth":50,"mobileHeight":"30px","width":"100%"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"phoneGapCall_contact","targetProperty":"liveSource"}, {}]
}]
}],
dojoGrid1: ["wm.DojoGrid", {"columns":[{"show":true,"field":"id","title":"Id","width":"50px","align":"right","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":true,"field":"name.formatted","title":"Formatted","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"name.familyName","title":"FamilyName","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"name.givenName","title":"GivenName","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"name.middleName","title":"MiddleName","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"name.honorificPrefix","title":"HonorificPrefix","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"name.honorificSuffix","title":"HonorificSuffix","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"nickname","title":"Nickname","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":true,"field":"birthday","title":"Birthday","width":"100px","align":"left","formatFunc":"wm_date_formatter","formatProps":{"useLocalTime":true,"dateType":"date"},"editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"note","title":"Note","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"PHONE COLUMN","title":"Contacts","width":"100%","align":"left","editorProps":{"restrictValues":true},"expression":"\"<div class='MobileRow'>Nom: \" + ${name.formatted} + \"</div>\"\n+ \"<div class='MobileRow'>Né le: \" + ${birthday} + \"</div>\"\n","isCustomField":true,"mobileColumn":true}],"dsType":"phonegap.Contact","height":"100%","localizationStructure":{},"margin":"4","minDesktopHeight":60,"primaryKeyFields":["id"],"singleClickEdit":true}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"phoneGapCall_contact","targetProperty":"dataSet"}, {}],
wire1: ["wm.Wire", {"expression":undefined,"source":"phoneGapCall_contact.input","targetProperty":"selectedItem"}, {}]
}]
}],
panel1: ["wm.HeaderContentPanel", {"height":"48px","horizontalAlign":"left","layoutKind":"left-to-right","margin":"2","verticalAlign":"middle","width":"100%"}, {}, {
button_Camera: ["wm.Button", {"caption":undefined,"imageIndex":20,"imageList":"app.silkIconList","margin":"4","width":"40px"}, {"onclick":"phoneGapCall_Camera"}],
button_Geoloc: ["wm.Button", {"caption":undefined,"imageIndex":36,"imageList":"app.silkIconList","margin":"4","width":"40px"}, {"onclick":"navigationCall_Mobile"}]
}]
}]
};

Page_Contacts.prototype._cssText = '';
Page_Contacts.prototype._htmlText = '';