package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.c.a.bd;
import com.tencent.mm.c.a.hb;
import com.tencent.mm.c.a.hc;
import com.tencent.mm.c.a.he;
import com.tencent.mm.c.a.hf;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dx;
import com.tencent.mm.model.x;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.ui.chat.ao;
import com.tencent.mm.pluginsdk.ui.tools.bc;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.q.g;
import com.tencent.mm.storage.cj;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.dz;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class ChatFooterCustom extends LinearLayout
  implements View.OnClickListener, dx
{
  private String epd;
  private ao hDo = null;
  private LinearLayout jmY = null;
  private ImageView jmZ = null;
  private ImageView jna = null;
  private av jnb = null;
  private ma jnc = null;
  private int jnd = 0;
  private cj jne;
  private com.tencent.mm.storage.i jnf;
  private at jng;
  private au jnh;
  private dz jni;
  private List jnj = new LinkedList();
  private final String jnk = "qrcode";
  private final String jnl = "barcode";
  private com.tencent.mm.q.h jnm;
  private Object mSyncObj = new Object();

  public ChatFooterCustom(Context paramContext)
  {
    this(paramContext, null);
  }

  public ChatFooterCustom(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ChatFooterCustom(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
  }

  private boolean a(com.tencent.mm.q.h paramh)
  {
    if (paramh == null)
      return false;
    String str = paramh.id + paramh.dqq;
    Object localObject1 = this.mSyncObj;
    int i = 0;
    while (true)
    {
      try
      {
        if (i < this.jnj.size())
        {
          if (((String)this.jnj.get(i)).equals(str))
          {
            j = i;
            if (j >= 0)
            {
              this.jnj.remove(j);
              Object[] arrayOfObject1 = new Object[2];
              arrayOfObject1[0] = str;
              arrayOfObject1[1] = Integer.valueOf(this.jnj.size());
              com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "removeOneFromMenuClickCmdList success %s %d", arrayOfObject1);
              return true;
            }
          }
          else
          {
            i++;
            continue;
          }
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = str;
          arrayOfObject2[1] = Integer.valueOf(this.jnj.size());
          com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "removeOneFromMenuClickCmdList fail %s %d", arrayOfObject2);
          return false;
        }
      }
      finally
      {
      }
      int j = -1;
    }
  }

  private void aUA()
  {
    File localFile = new File(com.tencent.mm.compatible.g.h.dOL);
    if ((!localFile.exists()) && (!localFile.mkdir()))
      Toast.makeText((Activity)getContext(), getContext().getString(com.tencent.mm.n.bAn), 1).show();
    while ((this.jni == null) || (bc.a(this.jni, com.tencent.mm.compatible.g.h.dOL, "microMsg." + System.currentTimeMillis() + ".jpg")))
      return;
    Toast.makeText((Activity)getContext(), getContext().getString(com.tencent.mm.n.cdH), 1).show();
  }

  private void aUC()
  {
    com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "switch footer");
    if (this.hDo != null)
    {
      this.jnb.aUE();
      this.hDo.dK(true);
    }
  }

  private void aUD()
  {
    if (this.jnf == null);
    while (this.jnf.jB() != 1)
      return;
    bg.qW().oW().yH(this.jnf.getUsername());
  }

  private void aUz()
  {
    if ((this.jni != null) && (this.jnf != null) && (!com.tencent.mm.platformtools.ap.jb(this.epd)))
      bc.a(this.jni, 217, 9, 3, this.epd, this.jnf.getUsername());
  }

  private boolean af(Object paramObject)
  {
    if (!(paramObject instanceof hb))
      com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "send current location data type error!");
    while (true)
    {
      return true;
      hb localhb = (hb)paramObject;
      double d1 = localhb.cLQ.cGO;
      double d2 = localhb.cLQ.cGP;
      int i = localhb.cLQ.cGQ;
      String str1 = localhb.cLQ.label;
      String str2 = localhb.cLQ.cLS;
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = Double.valueOf(d1);
      arrayOfObject[1] = Double.valueOf(d2);
      arrayOfObject[2] = Integer.valueOf(i);
      arrayOfObject[3] = str1;
      arrayOfObject[4] = str2;
      com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "lat:%f , lng:%f , scale: %d , label:%s , poiname:%s", arrayOfObject);
      if ((this.jnm == null) || (this.jnm.dqt != 105))
      {
        com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "cache lost or location type is not correct");
        return true;
      }
      this.jnm.dqs = com.tencent.mm.q.h.dqp;
      com.tencent.mm.q.h localh = this.jnm;
      try
      {
        JSONObject localJSONObject1 = new JSONObject();
        localJSONObject1.put("x", String.valueOf(d1));
        localJSONObject1.put("y", String.valueOf(d2));
        localJSONObject1.put("scale", i);
        localJSONObject1.put("label", str1);
        localJSONObject1.put("poiname", str2);
        JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("location", localJSONObject1);
        localh.content = localJSONObject2.toString();
        com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", localh.content);
        if (!a(this.jnm))
          continue;
        d(this.jnm);
        c(this.jnm);
        return true;
      }
      catch (JSONException localJSONException)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", localJSONException.toString());
      }
    }
  }

  private boolean ag(Object paramObject)
  {
    if (!(paramObject instanceof he))
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "send current location data type error!");
      return false;
    }
    he localhe = (he)paramObject;
    if ((this.jnm == null) || ((this.jnm.dqt != 100) && (this.jnm.dqt != 101)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "null pointer in cache or type error");
      return false;
    }
    String str1;
    switch (localhe.cLT.cLV)
    {
    default:
      str1 = "";
    case 0:
    case 1:
    }
    while (true)
    {
      String str2 = localhe.cLT.cLW;
      com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "scan type: %s , scan result:%s", new Object[] { str1, str2 });
      this.jnm.dqs = com.tencent.mm.q.h.dqp;
      com.tencent.mm.q.h localh = this.jnm;
      com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "type is %s , result is %s", new Object[] { str1, str2 });
      try
      {
        JSONObject localJSONObject1 = new JSONObject();
        localJSONObject1.put("scan_type", str1);
        localJSONObject1.put("scan_result", str2);
        JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("scan_code", localJSONObject1);
        localh.content = localJSONObject2.toString();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localh.content;
        com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "content: %s", arrayOfObject);
        if (a(this.jnm))
        {
          d(this.jnm);
          c(this.jnm);
        }
        return true;
        str1 = "qrcode";
        continue;
        str1 = "barcode";
      }
      catch (JSONException localJSONException)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", localJSONException.toString());
      }
    }
  }

  private void b(com.tencent.mm.q.h paramh)
  {
    com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this.epd;
    arrayOfObject[1] = Integer.valueOf(paramh.id);
    arrayOfObject[2] = paramh.dqq;
    arrayOfObject[3] = com.tencent.mm.q.h.dqn;
    arrayOfObject[4] = "";
    localn.d(10809, arrayOfObject);
  }

  private void c(com.tencent.mm.q.h paramh)
  {
    com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this.epd;
    arrayOfObject[1] = Integer.valueOf(paramh.id);
    arrayOfObject[2] = paramh.dqq;
    arrayOfObject[3] = com.tencent.mm.q.h.dqp;
    arrayOfObject[4] = paramh.content;
    localn.d(10809, arrayOfObject);
  }

  private void d(com.tencent.mm.q.h paramh)
  {
    com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", paramh.getInfo());
    com.tencent.mm.q.z localz = new com.tencent.mm.q.z(this.epd, 1, paramh.getInfo());
    bg.qX().d(localz);
  }

  public final void DP()
  {
    this.jmY = ((LinearLayout)findViewById(com.tencent.mm.i.aly));
    this.jna = ((ImageView)findViewById(com.tencent.mm.i.alA));
    this.jna.setOnClickListener(new ar(this));
    this.jmZ = ((ImageView)findViewById(com.tencent.mm.i.alx));
    this.jmZ.setOnClickListener(new as(this));
  }

  public final void H(com.tencent.mm.storage.i parami)
  {
    this.jnf = parami;
  }

  public final void a(ao paramao)
  {
    this.hDo = paramao;
  }

  public final void a(ma paramma)
  {
    this.jnc = paramma;
  }

  public final void a(dz paramdz, ViewGroup paramViewGroup, g paramg, String paramString)
  {
    if ((paramg == null) || (paramg.dqm == null) || (paramString == null))
      throw new IllegalArgumentException(" menuInfo or username is null ! ");
    this.jnd = Math.min(paramg.dqm.size(), 6);
    com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "setMenus, count:" + this.jnd);
    if (this.jnd <= 0)
      throw new IllegalArgumentException(" mTabCount is invalid ! ");
    int i;
    label123: FrameLayout localFrameLayout;
    TextView localTextView;
    ImageView localImageView;
    if (this.jnd > 3)
    {
      this.jmZ.setVisibility(0);
      this.jmY.setWeightSum(Math.min(this.jnd, 3));
      i = 0;
      if (i >= 6)
        break label327;
      localFrameLayout = (FrameLayout)this.jmY.getChildAt(i);
      localTextView = (TextView)localFrameLayout.getChildAt(0);
      localImageView = (ImageView)localFrameLayout.getChildAt(1);
      localImageView.setVisibility(8);
      if (i >= this.jnd)
        break label267;
      com.tencent.mm.q.h localh = (com.tencent.mm.q.h)paramg.dqm.get(i);
      localFrameLayout.setTag(localh);
      localTextView.setText(com.tencent.mm.ar.b.e(getContext(), localh.name, -1));
      if (localh.type == 0)
        localImageView.setVisibility(0);
      localFrameLayout.setOnClickListener(this);
      localFrameLayout.setVisibility(0);
    }
    while (true)
    {
      i++;
      break label123;
      this.jmZ.setVisibility(8);
      break;
      label267: if ((i >= 3) && (this.jnd > 3))
      {
        localFrameLayout.setTag(null);
        localTextView.setText("");
        localImageView.setVisibility(8);
        localFrameLayout.setOnClickListener(null);
        localFrameLayout.setVisibility(0);
      }
      else
      {
        localFrameLayout.setVisibility(8);
      }
    }
    label327: this.jni = paramdz;
    this.epd = paramString;
    this.jnb = new av(getContext(), paramViewGroup);
    this.jnb.setOnItemClickListener(new ap(this));
    this.jng = new at(this);
    this.jnh = new au(this);
    com.tencent.mm.sdk.c.a.aGB().a("PublishLocation", this.jng);
    com.tencent.mm.sdk.c.a.aGB().a("PublishScanCodeResult", this.jnh);
  }

  public final void aUB()
  {
    if (this.jnb != null)
      this.jnb.aUE();
  }

  public final void anl()
  {
    if (this.jng != null)
      com.tencent.mm.sdk.c.a.aGB().b("PublishLocation", this.jng);
    if (this.jnh != null)
      com.tencent.mm.sdk.c.a.aGB().b("PublishScanCodeResult", this.jnh);
  }

  public final void b(q paramq)
  {
    String str1 = ai.a(paramq.hOS);
    com.tencent.mm.sdk.platformtools.z.i("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "SysCmdMsgExtension:" + str1);
    try
    {
      XmlPullParserFactory localXmlPullParserFactory = XmlPullParserFactory.newInstance();
      localXmlPullParserFactory.setNamespaceAware(true);
      XmlPullParser localXmlPullParser = localXmlPullParserFactory.newPullParser();
      localXmlPullParser.setInput(new StringReader(str1));
      int i = localXmlPullParser.getEventType();
      break label180;
      while (true)
      {
        i = localXmlPullParser.next();
        break;
        String str2 = localXmlPullParser.getName();
        if ("sysmsg".equals(str2))
        {
          if ("type".equals(localXmlPullParser.getAttributeName(0)))
            localXmlPullParser.getAttributeValue(0);
        }
        else if ("username".equals(str2))
          localXmlPullParser.nextText();
        else if ("data".equals(str2))
          localXmlPullParser.nextText();
      }
      label180: if (i != 1)
        switch (i)
        {
        case 1:
        default:
        case 0:
        case 2:
        }
    }
    catch (Exception localException)
    {
    }
  }

  public final boolean h(int paramInt, Object paramObject)
  {
    if (paramObject == null)
      com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "returned data is null, maybe serve for UI");
    label121: 
    do
    {
      do
      {
        ArrayList localArrayList1;
        ArrayList localArrayList2;
        do
        {
          String str3;
          do
          {
            return true;
            switch (paramInt)
            {
            default:
            case 203:
            case 217:
            }
            while (true)
              switch (paramInt)
              {
              default:
                return true;
              case 1001:
                com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "return from camera");
                if ((paramObject instanceof Intent))
                  break label121;
                com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "type error");
                return true;
                paramInt = 1001;
                continue;
                paramInt = 1002;
              case 1002:
              case 1005:
              case 1006:
              case 1003:
              case 1004:
              }
            str3 = ((Intent)paramObject).getStringExtra("CropImage_OutputPath");
            if (str3 == null)
            {
              com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "return null path");
              return true;
            }
            File localFile2 = new File(str3);
            if ((!localFile2.exists()) || (!localFile2.isFile()))
              break;
            com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "%s retrieved!", new Object[] { str3 });
            String str4 = com.tencent.mm.a.f.c(localFile2);
            com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "MD5 is %s", new Object[] { str4 });
            if ((this.jnm == null) || ((this.jnm.dqt != 102) && (this.jnm.dqt != 103)))
            {
              com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "camera photo cache lost or temp type error! cannot pass info!");
              return true;
            }
            ArrayList localArrayList3 = new ArrayList();
            localArrayList3.add(str4);
            this.jnm.dqs = com.tencent.mm.q.h.dqp;
            this.jnm.d(localArrayList3);
          }
          while (!a(this.jnm));
          d(this.jnm);
          c(this.jnm);
          return true;
          com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "%s cannot be retrieved as file or is directory!!", new Object[] { str3 });
          return true;
          com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "return from albumn");
          if (!(paramObject instanceof Intent))
          {
            com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "type error");
            return true;
          }
          localArrayList1 = ((Intent)paramObject).getStringArrayListExtra("CropImage_OutputPath_List");
          localArrayList2 = new ArrayList();
        }
        while ((localArrayList1 == null) || (localArrayList1.size() == 0));
        Iterator localIterator = localArrayList1.iterator();
        while (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "retrieving bitmap path %s", new Object[] { str1 });
          if (str1 != null)
          {
            File localFile1 = new File(str1);
            if ((localFile1.exists()) && (localFile1.isFile()))
            {
              com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "%s retrieved!", new Object[] { str1 });
              String str2 = com.tencent.mm.a.f.c(localFile1);
              localArrayList2.add(str2);
              com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "MD5 is %s", new Object[] { str2 });
            }
          }
          else
          {
            com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "no file contained!");
            continue;
            com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "%s cannot be retrieved as file or is directory!!", new Object[] { str1 });
          }
        }
        if ((this.jnm == null) || ((this.jnm.dqt != 104) && (this.jnm.dqt != 103)))
        {
          com.tencent.mm.sdk.platformtools.z.e("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "albumn photo cache lost or temp type error! cannot pass info!");
          return true;
        }
        this.jnm.dqs = com.tencent.mm.q.h.dqp;
        this.jnm.d(localArrayList2);
      }
      while (!a(this.jnm));
      d(this.jnm);
      c(this.jnm);
      return true;
      com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "send current");
      af(paramObject);
      return true;
      com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "send selected");
      af(paramObject);
      return true;
      com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "send qrcode wait msg");
    }
    while (!ag(paramObject));
    this.jnc.aWl();
    return true;
    com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "send qrcode direct");
    ag(paramObject);
    return true;
  }

  public void onClick(View paramView)
  {
    while (true)
    {
      com.tencent.mm.q.h localh;
      try
      {
        Object localObject2 = paramView.getTag();
        boolean bool1 = localObject2 instanceof com.tencent.mm.q.h;
        if (!bool1)
          return;
        localh = (com.tencent.mm.q.h)localObject2;
        localh.content = "";
        switch (localh.type)
        {
        case 0:
          int[] arrayOfInt = new int[2];
          paramView.getLocationOnScreen(arrayOfInt);
          Object[] arrayOfObject3 = new Object[3];
          arrayOfObject3[0] = Integer.valueOf(arrayOfInt[0]);
          arrayOfObject3[1] = Integer.valueOf(arrayOfInt[1]);
          arrayOfObject3[2] = Integer.valueOf(paramView.getWidth());
          com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "show/dismiss submenu, pos:(%d, %d), view width:%d", arrayOfObject3);
          this.jnb.a(localh, arrayOfInt[0] + paramView.getWidth() / 2, arrayOfInt[1]);
          continue;
        case 2:
        case 3:
        case 1:
        case 4:
        }
      }
      finally
      {
      }
      com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "start webview url");
      aUD();
      this.jnb.aUE();
      localh.dqs = com.tencent.mm.q.h.dqn;
      b(localh);
      d(localh);
      if (!oj.aA(getContext(), localh.value))
      {
        Intent localIntent4 = new Intent();
        localIntent4.putExtra("rawUrl", localh.value);
        localIntent4.putExtra("geta8key_username", this.epd);
        com.tencent.mm.am.a.b(getContext(), "webview", ".ui.tools.WebViewUI", localIntent4);
        continue;
        com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "switch to input");
        this.jnb.aUE();
        aUC();
        localh.dqs = com.tencent.mm.q.h.dqn;
        b(localh);
        d(localh);
        continue;
        com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "get latest message");
        aUD();
        this.jnb.aUE();
        localh.dqs = com.tencent.mm.q.h.dqn;
        b(localh);
        d(localh);
        this.jnc.aWl();
        continue;
        com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "MM_BIZ_CUSTOM_MENU_TYPE_CUSTOM_CLICK");
        aUD();
        this.jnb.aUE();
        localh.dqs = com.tencent.mm.q.h.dqo;
        String str1 = localh.id + localh.dqq;
        Intent localIntent2;
        synchronized (this.mSyncObj)
        {
          this.jnj.add(str1);
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = str1;
          arrayOfObject1[1] = Integer.valueOf(this.jnj.size());
          com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", "addToMenuClickCmdList %s %d", arrayOfObject1);
          com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject2 = new Object[5];
          arrayOfObject2[0] = this.epd;
          arrayOfObject2[1] = Integer.valueOf(localh.id);
          arrayOfObject2[2] = localh.dqq;
          arrayOfObject2[3] = com.tencent.mm.q.h.dqo;
          arrayOfObject2[4] = "";
          localn.d(10809, arrayOfObject2);
          this.jnm = localh;
          switch (localh.dqt)
          {
          case 100:
            Intent localIntent3 = new Intent();
            localIntent3.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
            localIntent3.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
            localIntent3.putExtra("key_is_finish_on_scanned", true);
            com.tencent.mm.am.a.b(getContext(), "scanner", ".ui.BaseScanUI", localIntent3);
          case 101:
          case 102:
          case 103:
          case 104:
          case 105:
          case 106:
          case 107:
          }
        }
        localIntent2.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
        localIntent2.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
        localIntent2.putExtra("key_is_finish_on_scanned", false);
        com.tencent.mm.am.a.b(getContext(), "scanner", ".ui.BaseScanUI", localIntent2);
        continue;
        aUA();
        continue;
        if (!bg.qW().isSDCardAvailable())
        {
          en.cp(getContext());
        }
        else
        {
          String[] arrayOfString = new String[2];
          arrayOfString[0] = getContext().getString(com.tencent.mm.n.byF);
          arrayOfString[1] = getContext().getString(com.tencent.mm.n.byE);
          e.b(getContext(), null, arrayOfString, null, new aq(this));
          continue;
          aUz();
        }
      }
    }
    Intent localIntent1 = new Intent();
    localIntent1.putExtra("map_view_type", 0);
    StringBuilder localStringBuilder1 = new StringBuilder("getSender ");
    if (this.jne == null);
    for (boolean bool2 = true; ; bool2 = false)
    {
      StringBuilder localStringBuilder2 = localStringBuilder1.append(bool2).append(" ");
      String str2;
      label892: String str3;
      if (this.jne == null)
      {
        str2 = x.pG();
        com.tencent.mm.sdk.platformtools.z.d("!32@VFuxRDy9S3iHyB/EdEmcj1cAXarHNdCf", str2);
        if (this.jne != null)
          break label1001;
        str3 = x.pG();
        label919: localIntent1.putExtra("map_sender_name", str3);
        if (this.jnf != null)
          break label1013;
      }
      label1001: label1013: for (String str4 = null; ; str4 = this.jnf.getUsername())
      {
        localIntent1.putExtra("map_talker_name", str4);
        localIntent1.putExtra("view_type_key", 1);
        localIntent1.putExtra("key_get_location_type", 1);
        com.tencent.mm.am.a.b(getContext(), "location", ".ui.RedirectUI", localIntent1);
        break;
        str2 = this.jne.getName();
        break label892;
        str3 = this.jne.getName();
        break label919;
      }
      bd localbd2 = new bd();
      localbd2.cIh.op = 1;
      localbd2.cIh.cDi = this.jnf.getUsername();
      localbd2.cIh.context = getContext();
      com.tencent.mm.sdk.c.a.aGB().g(localbd2);
      break;
      bd localbd1 = new bd();
      localbd1.cIh.op = 2;
      localbd1.cIh.cDi = this.jnf.getUsername();
      localbd1.cIh.context = getContext();
      com.tencent.mm.sdk.c.a.aGB().g(localbd1);
      break;
      break;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChatFooterCustom
 * JD-Core Version:    0.6.2
 */