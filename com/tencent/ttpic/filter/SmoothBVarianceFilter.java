package com.tencent.ttpic.filter;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.m.i;
import com.tencent.filter.m.n;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SmoothBVarianceFilter extends BaseFilter
{
  public static final String FRAGMENT_SHADER = "mee2579x2037539190x543649385x1751607656x1702240368x1948267107x1970567269x1866687858x1768190575x1702125934x1635125819x1852406130x1768431719x544237671x845374838x2019914784x1701999988x1919905603x1634625892x993158516x1768846602x1836216166x1835103008x1919249520x1763722290x1953853550x1734438217x2019906661x1701999988x1853164091x1919903337x1634934893x1701605485x541340274x1970302569x1634552180x1700029799x1920300152x171651685x1718185589x544043631x544501353x1632005737x1699898723x171668579x1718185589x544043631x544501353x1635020658x1852795252x1812597307x544241519x862152054x1650946592x1987274802x2003790888x1702240368x1663054691x175841321x538976288x1886875500x1667593760x541794356x1702240317x807941219x539766830x808333613x857747232x539766830x540028466x775102511x757083184x691023409x538970683x1768431648x544237671x878929270x1025536032x2020175136x1667593768x778250292x539780962x2054630987x1981819945x674521957x1650929251x776675372x740915576x1702130464x778250352x1663052898x690579246x538970683x1768431648x544237671x878929270x1025536288x2020175136x1667593768x779102260x746027384x1915642656x1981819945x674521957x745680483x2033086496x740915322x1702130464x779102320x1663052920x690582062x538970683x1768431648x544237671x1634692198x543432820x779165757x539828344x678324589x746008177x2033086752x537541417x1746935840x1885890409x1869375008x1696625761x824196384x761606190x171651121x538976288x1886875500x1667593760x1936203827x540876918x862152054x1935827240x2049863976x673196832x544681585x779165741x790636921x775301152x539631664x539697252x740895077x790651936x779167776x539697272x539765093x695742065x538970683x1701978144x1852994932x1987274784x175966779x1768912394x1634541668x690515561x537557792x1814044704x544241519x862152054x1866688800x544370540x1702109245x1920300152x675557989x1970302569x1634552180x1700029799x1920300152x1948265573x1970567269x1866687858x1768190575x1702125934x1735536169x537541474x1814044704x544241519x862152054x1634037024x1819231086x1025536623x2019914784x1701999988x1764246578x1953853550x1734438217x2019906661x1701999988x1948265522x1970567269x1866687858x1768190575x1702125934x1735536169x537541474x1814044704x544241519x862152054x1718182944x1819231078x1025536623x1130965024x1919904879x1830825248x1131307365x1919904879x539631657x925904439x538970683x1768169504x1866688102x544370540x1768759357x1768171630x1866688102x544370540x1768169514x1866688102x745697132x808333600x168442665x538976288x1886875500x1869375008x1948284001x1635018088x807419168x171651374x538976288x1768187245x544238965x1634692198x1768169588x1983997542x540876903x1718182952x1819231078x1915646575x1679829792x1130784361x1919904879x723543854x1718182944x1819231078x1647211119x539959337x993013299x538976266x1684368672x1886221673x1869375008x1679848545x1181116009x1869898593x540876914x808333608x1679830304x1097229929x790652790x1768171552x1983997542x539697255x1952802932x992553313x538970634x1869357088x1981837431x540238693x544633704x1735532605x1936208482x1130965110x1919904879x1650946606x537541417x1830821920x1969841253x1713401965x1952542572x540110880x1818435645x678456673x1852402984x1866688808x779251564x1830825074x1131307365x1919904879x757101102x825110560x539828265x691154480x874523168x539766830x741355056x808333600x537541417x1830821920x1969841253x1713401965x1952542572x1597141024x1952867692x673201440x942747184x1663053088x1886216556x1987274792x539785262x909192752x774905900x690567217x807415584x993144878x538976266x1684368672x1886221673x1869375008x1881175137x1769103154x544499815x774971453x539828272x959328296x539828273x1835101283x1936205936x746073718x942551072x807414841x691091758x539959337x842018352x538970683x1701650464x1836411236x1818632304x544498031x1985950320x1702194273x824196384x757084206x774907936x539828275x1835101283x1936205936x746204790x841887776x774905900x539568435x774905903x537541425x1830821920x1969841253x1713401965x1952542572x540176416x1768759357x1634543726x846211192x1717922911x1881156724x1769103154x695494759x846209068x1818326623x992568693x538976266x1684368672x1886221673x1869375008x1881175137x1830829344x1881700449x1881156657x171649330x538976266x543582496x1181641000x1382376289x544498533x807419196x175841321x538976288x538976288x673212009x1819231081x1915646575x1866688813x779251564x540811367x892350000x2088509497x1866688800x779251564x1027350642x1866688800x779251564x2088509538x774907936x1008744497x1936203837x544747126x1746937382x2016310899x540884000x959983152x2088509481x1987274784x1008761390x774905917x2065705266x538976266x538976288x538976288x1025536032x808333344x538970683x538976288x545071136x1702063205x543582496x1181641000x1382376289x544498533x757087549x2065705265x538976266x538976288x538976288x1025536032x1852402976x741437480x691171360x807414304x171652398x538976288x538976288x538970749x545071136x1702063205x537557792x538976288x1814044704x544241519x845374838x1852138272x1349674356x1025536879x1667593760x774907954x807414837x992556334x538976266x538976288x1734961184x1713401960x1952542572x1852138272x1148347764x1025536873x1936286752x1668178292x1702111333x1920300152x1869562725x1852400754x845509729x1700995116x1919251566x695430992x538970683x538976288x1768431648x544237671x1634692198x1700995188x1919251566x1952670022x1025536623x1818437664x678456673x808922672x757084471x1852138272x1148347764x539784041x741355056x858664992x691091248x539959337x808660528x792408375x774905903x825700407x1852140605x677934183x845374838x892219432x169879849x538976288x538976288x1751607656x1818632304x544498031x1701998438x1684104520x1952670022x1025536623x774973472x539828272x1835101283x1702111344x1920300152x1869562725x1852400754x845509729x539785518x741879344x808333600x706750761x808334624x537534523x538976288x1763713056x1915232358x1952543855x544108393x958414141x1713383728x1214607983x1180983653x1869898593x540876914x808333608x1663053088x1886216556x2019914792x1701999988x1919905603x1634625892x775054708x807414904x539768878x691023409x539631657x993013301x538970656x538976288x1718165536x1869752352x1769234804x1025535599x942743613x1713383728x1214607983x1180983653x1869898593x540876914x1835101283x1702111344x1920300152x1869562725x1852400754x845509729x539785518x741355056x841887776x539631657x993013301x538970656x538976288x1718165536x1869752352x1769234804x1025535599x926031933x1713383728x1214607983x1180983653x1869898593x540876914x1835101283x1702111344x1920300152x1869562725x1852400754x845509729x539785262x741355056x841887776x539631657x993013301x538970656x538976288x544219168x1663057194x1702129253x1667319410x544370548x1868963882x1699243378x1632003169x1919906915x538970683x175972384x538976266x1684368672x1886221673x1869375008x1797289057x544106829x1768169533x1632003686x1919906915x1881156128x537528891x1830821920x1969841253x1981837421x540238693x1802723693x1869377347x540876914x862152054x1718182952x1735803238x774971436x539828272x1852394859x774905900x171649328x538976288x1180658791x1130848626x1919904879x1981824288x674521957x1802723693x1869377347x824192114x992555054x8200202x";
  public static final String VERTEX_SHADER = "mee274x1920234593x1953849961x1702240357x1881158755x1953067887x997093225x1953784074x1969383794x1981834612x540304229x1970302569x2019906676x1701999988x1919905603x1634625892x171664756x1918989834x1735289209x1667593760x1702109234x1920300152x1869562725x1852400754x996504673x1918989834x1735289209x1667593760x1702109234x1920300152x1869562725x1852400754x845509729x1870006843x1830839401x678324577x175835689x538976288x1348430951x1953067887x544108393x1869619261x1769236851x171667055x538976288x1954047348x1130721909x1685221231x1952542313x540876901x1769172848x1852795252x544831534x774905898x539697205x993340976x538976266x2019914784x1701999988x1919905603x1634625892x540173684x1852383293x1416918384x1970567269x1866687858x1768190575x1702125934x997816366x32010x";

  public SmoothBVarianceFilter()
  {
    super("mee274x1920234593x1953849961x1702240357x1881158755x1953067887x997093225x1953784074x1969383794x1981834612x540304229x1970302569x2019906676x1701999988x1919905603x1634625892x171664756x1918989834x1735289209x1667593760x1702109234x1920300152x1869562725x1852400754x996504673x1918989834x1735289209x1667593760x1702109234x1920300152x1869562725x1852400754x845509729x1870006843x1830839401x678324577x175835689x538976288x1348430951x1953067887x544108393x1869619261x1769236851x171667055x538976288x1954047348x1130721909x1685221231x1952542313x540876901x1769172848x1852795252x544831534x774905898x539697205x993340976x538976266x2019914784x1701999988x1919905603x1634625892x540173684x1852383293x1416918384x1970567269x1866687858x1768190575x1702125934x997816366x32010x", "mee2579x2037539190x543649385x1751607656x1702240368x1948267107x1970567269x1866687858x1768190575x1702125934x1635125819x1852406130x1768431719x544237671x845374838x2019914784x1701999988x1919905603x1634625892x993158516x1768846602x1836216166x1835103008x1919249520x1763722290x1953853550x1734438217x2019906661x1701999988x1853164091x1919903337x1634934893x1701605485x541340274x1970302569x1634552180x1700029799x1920300152x171651685x1718185589x544043631x544501353x1632005737x1699898723x171668579x1718185589x544043631x544501353x1635020658x1852795252x1812597307x544241519x862152054x1650946592x1987274802x2003790888x1702240368x1663054691x175841321x538976288x1886875500x1667593760x541794356x1702240317x807941219x539766830x808333613x857747232x539766830x540028466x775102511x757083184x691023409x538970683x1768431648x544237671x878929270x1025536032x2020175136x1667593768x778250292x539780962x2054630987x1981819945x674521957x1650929251x776675372x740915576x1702130464x778250352x1663052898x690579246x538970683x1768431648x544237671x878929270x1025536288x2020175136x1667593768x779102260x746027384x1915642656x1981819945x674521957x745680483x2033086496x740915322x1702130464x779102320x1663052920x690582062x538970683x1768431648x544237671x1634692198x543432820x779165757x539828344x678324589x746008177x2033086752x537541417x1746935840x1885890409x1869375008x1696625761x824196384x761606190x171651121x538976288x1886875500x1667593760x1936203827x540876918x862152054x1935827240x2049863976x673196832x544681585x779165741x790636921x775301152x539631664x539697252x740895077x790651936x779167776x539697272x539765093x695742065x538970683x1701978144x1852994932x1987274784x175966779x1768912394x1634541668x690515561x537557792x1814044704x544241519x862152054x1866688800x544370540x1702109245x1920300152x675557989x1970302569x1634552180x1700029799x1920300152x1948265573x1970567269x1866687858x1768190575x1702125934x1735536169x537541474x1814044704x544241519x862152054x1634037024x1819231086x1025536623x2019914784x1701999988x1764246578x1953853550x1734438217x2019906661x1701999988x1948265522x1970567269x1866687858x1768190575x1702125934x1735536169x537541474x1814044704x544241519x862152054x1718182944x1819231078x1025536623x1130965024x1919904879x1830825248x1131307365x1919904879x539631657x925904439x538970683x1768169504x1866688102x544370540x1768759357x1768171630x1866688102x544370540x1768169514x1866688102x745697132x808333600x168442665x538976288x1886875500x1869375008x1948284001x1635018088x807419168x171651374x538976288x1768187245x544238965x1634692198x1768169588x1983997542x540876903x1718182952x1819231078x1915646575x1679829792x1130784361x1919904879x723543854x1718182944x1819231078x1647211119x539959337x993013299x538976266x1684368672x1886221673x1869375008x1679848545x1181116009x1869898593x540876914x808333608x1679830304x1097229929x790652790x1768171552x1983997542x539697255x1952802932x992553313x538970634x1869357088x1981837431x540238693x544633704x1735532605x1936208482x1130965110x1919904879x1650946606x537541417x1830821920x1969841253x1713401965x1952542572x540110880x1818435645x678456673x1852402984x1866688808x779251564x1830825074x1131307365x1919904879x757101102x825110560x539828265x691154480x874523168x539766830x741355056x808333600x537541417x1830821920x1969841253x1713401965x1952542572x1597141024x1952867692x673201440x942747184x1663053088x1886216556x1987274792x539785262x909192752x774905900x690567217x807415584x993144878x538976266x1684368672x1886221673x1869375008x1881175137x1769103154x544499815x774971453x539828272x959328296x539828273x1835101283x1936205936x746073718x942551072x807414841x691091758x539959337x842018352x538970683x1701650464x1836411236x1818632304x544498031x1985950320x1702194273x824196384x757084206x774907936x539828275x1835101283x1936205936x746204790x841887776x774905900x539568435x774905903x537541425x1830821920x1969841253x1713401965x1952542572x540176416x1768759357x1634543726x846211192x1717922911x1881156724x1769103154x695494759x846209068x1818326623x992568693x538976266x1684368672x1886221673x1869375008x1881175137x1830829344x1881700449x1881156657x171649330x538976266x543582496x1181641000x1382376289x544498533x807419196x175841321x538976288x538976288x673212009x1819231081x1915646575x1866688813x779251564x540811367x892350000x2088509497x1866688800x779251564x1027350642x1866688800x779251564x2088509538x774907936x1008744497x1936203837x544747126x1746937382x2016310899x540884000x959983152x2088509481x1987274784x1008761390x774905917x2065705266x538976266x538976288x538976288x1025536032x808333344x538970683x538976288x545071136x1702063205x543582496x1181641000x1382376289x544498533x757087549x2065705265x538976266x538976288x538976288x1025536032x1852402976x741437480x691171360x807414304x171652398x538976288x538976288x538970749x545071136x1702063205x537557792x538976288x1814044704x544241519x845374838x1852138272x1349674356x1025536879x1667593760x774907954x807414837x992556334x538976266x538976288x1734961184x1713401960x1952542572x1852138272x1148347764x1025536873x1936286752x1668178292x1702111333x1920300152x1869562725x1852400754x845509729x1700995116x1919251566x695430992x538970683x538976288x1768431648x544237671x1634692198x1700995188x1919251566x1952670022x1025536623x1818437664x678456673x808922672x757084471x1852138272x1148347764x539784041x741355056x858664992x691091248x539959337x808660528x792408375x774905903x825700407x1852140605x677934183x845374838x892219432x169879849x538976288x538976288x1751607656x1818632304x544498031x1701998438x1684104520x1952670022x1025536623x774973472x539828272x1835101283x1702111344x1920300152x1869562725x1852400754x845509729x539785518x741879344x808333600x706750761x808334624x537534523x538976288x1763713056x1915232358x1952543855x544108393x958414141x1713383728x1214607983x1180983653x1869898593x540876914x808333608x1663053088x1886216556x2019914792x1701999988x1919905603x1634625892x775054708x807414904x539768878x691023409x539631657x993013301x538970656x538976288x1718165536x1869752352x1769234804x1025535599x942743613x1713383728x1214607983x1180983653x1869898593x540876914x1835101283x1702111344x1920300152x1869562725x1852400754x845509729x539785518x741355056x841887776x539631657x993013301x538970656x538976288x1718165536x1869752352x1769234804x1025535599x926031933x1713383728x1214607983x1180983653x1869898593x540876914x1835101283x1702111344x1920300152x1869562725x1852400754x845509729x539785262x741355056x841887776x539631657x993013301x538970656x538976288x544219168x1663057194x1702129253x1667319410x544370548x1868963882x1699243378x1632003169x1919906915x538970683x175972384x538976266x1684368672x1886221673x1869375008x1797289057x544106829x1768169533x1632003686x1919906915x1881156128x537528891x1830821920x1969841253x1981837421x540238693x1802723693x1869377347x540876914x862152054x1718182952x1735803238x774971436x539828272x1852394859x774905900x171649328x538976288x1180658791x1130848626x1919904879x1981824288x674521957x1802723693x1869377347x824192114x992555054x8200202x");
    AppMethodBeat.i(82905);
    initParams();
    AppMethodBeat.o(82905);
  }

  private void initParams()
  {
    AppMethodBeat.i(82906);
    addParam(new m.n("inputImageTexture2", 0, 33986));
    addParam(new m.i("inFaceRect", 0));
    addParam(new m.i("rotation", 0));
    AppMethodBeat.o(82906);
  }

  public void setInFaceRect(int paramInt)
  {
    AppMethodBeat.i(82908);
    addParam(new m.i("inFaceRect", paramInt));
    AppMethodBeat.o(82908);
  }

  public void setRotation(int paramInt)
  {
    AppMethodBeat.i(82909);
    addParam(new m.i("rotation", paramInt));
    AppMethodBeat.o(82909);
  }

  public void setTexture2(int paramInt)
  {
    AppMethodBeat.i(82907);
    addParam(new m.n("inputImageTexture2", paramInt, 33986));
    AppMethodBeat.o(82907);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.SmoothBVarianceFilter
 * JD-Core Version:    0.6.2
 */