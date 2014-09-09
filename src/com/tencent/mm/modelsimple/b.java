package com.tencent.mm.modelsimple;

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

final class b
{
  public static BindWordingContent hp(String paramString)
  {
    BindWordingContent localBindWordingContent = new BindWordingContent("", "");
    XmlPullParserFactory localXmlPullParserFactory = XmlPullParserFactory.newInstance();
    localXmlPullParserFactory.setNamespaceAware(true);
    XmlPullParser localXmlPullParser = localXmlPullParserFactory.newPullParser();
    localXmlPullParser.setInput(new StringReader(paramString));
    int i = localXmlPullParser.getEventType();
    String str1 = "";
    if (i != 1)
    {
      switch (i)
      {
      case 3:
      default:
      case 2:
      case 4:
      }
      while (true)
      {
        i = localXmlPullParser.next();
        break;
        str1 = localXmlPullParser.getName();
        continue;
        String str2 = localXmlPullParser.getText();
        if ((str2 != null) && (str2.trim().length() > 0))
        {
          String str3 = str2.trim();
          if (str1.equalsIgnoreCase("title"))
            localBindWordingContent.title = str3;
          else if (str1.equalsIgnoreCase("text"))
            localBindWordingContent.content = str3;
          else if (str1.equalsIgnoreCase("type"))
            try
            {
              localBindWordingContent.dBZ = Integer.valueOf(str3);
            }
            catch (Exception localException)
            {
              localBindWordingContent.dBZ = Integer.valueOf(0);
            }
        }
      }
    }
    return localBindWordingContent;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.b
 * JD-Core Version:    0.6.2
 */