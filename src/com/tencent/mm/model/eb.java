package com.tencent.mm.model;

import com.tencent.mm.o.ac;
import com.tencent.mm.o.j;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class eb
  implements j
{
  public final com.tencent.mm.o.k a(q paramq)
  {
    int i = 0;
    if ((paramq == null) || (paramq.hOS == null))
    {
      z.f("!56@/B4Tb64lLpJ1mn1yTEPF73ZDQ50R1Ev65sOQfPQdXbT/Lqj8PBgXaQ==", "[oneliang]UpdatePackageMsgExtension failed, invalid cmdAM");
      return null;
    }
    z.i("!56@/B4Tb64lLpJ1mn1yTEPF73ZDQ50R1Ev65sOQfPQdXbT/Lqj8PBgXaQ==", "[oneliang]UpdatePackageMsgExtension start");
    String str = ai.a(paramq.hOS);
    DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
    while (true)
    {
      try
      {
        Document localDocument = localDocumentBuilderFactory.newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(str.getBytes())));
        localDocument.normalize();
        NodeList localNodeList1 = localDocument.getDocumentElement().getElementsByTagName("updatepackage");
        if ((localNodeList1 != null) && (localNodeList1.getLength() == 1))
        {
          NodeList localNodeList2 = localNodeList1.item(0).getChildNodes();
          int j = localNodeList2.getLength();
          if (i < j)
          {
            Node localNode1 = localNodeList2.item(i);
            if ((localNode1 == null) || (localNode1.getNodeName() == null) || (!localNode1.getNodeName().equals("pack")))
              break label253;
            NamedNodeMap localNamedNodeMap = localNode1.getAttributes();
            if (localNamedNodeMap == null)
              break label253;
            Node localNode2 = localNamedNodeMap.getNamedItem("type");
            if (localNode2 == null)
              break label253;
            com.tencent.mm.ad.k localk = new com.tencent.mm.ad.k(Integer.parseInt(localNode2.getNodeValue()));
            bg.qX().d(localk);
            break label253;
          }
        }
        z.i("!56@/B4Tb64lLpJ1mn1yTEPF73ZDQ50R1Ev65sOQfPQdXbT/Lqj8PBgXaQ==", "[oneliang]UpdatePackageMsgExtension end");
        return null;
      }
      catch (Exception localException)
      {
        return null;
      }
      label253: i++;
    }
  }

  public final void d(ar paramar)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.eb
 * JD-Core Version:    0.6.2
 */