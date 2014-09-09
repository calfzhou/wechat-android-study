package com.tencent.mm.compatible.loader;

import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class j
{
  private static final String TAG = j.class.getSimpleName();

  public static List cE(String paramString)
  {
    k localk = new k();
    SAXParserFactory localSAXParserFactory = SAXParserFactory.newInstance();
    try
    {
      localSAXParserFactory.newSAXParser().parse(new InputSource(new StringReader(paramString)), localk);
      label35: return localk.dOp;
    }
    catch (ParserConfigurationException localParserConfigurationException)
    {
      while (true)
        z.printErrStackTrace(TAG, localParserConfigurationException, "", new Object[0]);
    }
    catch (SAXException localSAXException)
    {
      while (true)
        z.printErrStackTrace(TAG, localSAXException, "", new Object[0]);
    }
    catch (IOException localIOException)
    {
      break label35;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.j
 * JD-Core Version:    0.6.2
 */