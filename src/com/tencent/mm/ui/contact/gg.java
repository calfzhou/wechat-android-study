package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.f;
import com.tencent.mm.g.a;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.pluginsdk.x;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.base.MaskLayout;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

final class gg extends BaseAdapter
{
  private Context context = null;
  private o gAj = null;
  private Map jCD = new HashMap();
  private Map jCE = new HashMap();
  private ColorStateList jCp;
  private ColorStateList jCq;

  public gg(Context paramContext, List paramList)
  {
    this.context = paramContext;
    this.jCD.clear();
    this.jCE.clear();
    this.gAj = bg.qW().oT();
    Iterator localIterator1 = paramList.iterator();
    int i = 0;
    while (localIterator1.hasNext())
    {
      long l = ((Long)localIterator1.next()).longValue();
      x localx = am.ayj();
      if (localx != null)
      {
        Iterator localIterator2 = localx.ce(l).iterator();
        while (localIterator2.hasNext())
        {
          String str = (String)localIterator2.next();
          a locala = new a();
          locala.setUsername(str);
          this.jCE.put(Integer.valueOf(this.jCD.size()), localx.cf(l));
          Map localMap = this.jCD;
          int j = i + 1;
          localMap.put(Integer.valueOf(i), locala);
          i = j;
        }
      }
    }
    try
    {
      XmlResourceParser localXmlResourceParser1 = paramContext.getResources().getXml(f.Ou);
      XmlResourceParser localXmlResourceParser2 = paramContext.getResources().getXml(f.Ov);
      this.jCp = ColorStateList.createFromXml(paramContext.getResources(), localXmlResourceParser1);
      this.jCq = ColorStateList.createFromXml(paramContext.getResources(), localXmlResourceParser2);
      return;
    }
    catch (IOException localIOException)
    {
    }
    catch (XmlPullParserException localXmlPullParserException)
    {
    }
  }

  private String qA(int paramInt)
  {
    if (!this.jCE.containsKey(Integer.valueOf(paramInt)))
      return "";
    return (String)this.jCE.get(Integer.valueOf(paramInt));
  }

  public final int getCount()
  {
    return this.jCD.size();
  }

  public final Object getItem(int paramInt)
  {
    Object localObject;
    if (paramInt < 0)
      localObject = null;
    com.tencent.mm.storage.i locali;
    do
    {
      do
      {
        return localObject;
        localObject = (a)this.jCD.get(Integer.valueOf(paramInt));
      }
      while (((a)localObject).jc() != 0);
      locali = this.gAj.ys(((a)localObject).getUsername());
    }
    while (locali == null);
    this.jCD.put(Integer.valueOf(paramInt), locali);
    return locali;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    gh localgh1;
    String str;
    label113: a locala;
    label161: TextView localTextView1;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, k.bdB, null);
      gh localgh2 = new gh((byte)0);
      localgh2.egz = ((TextView)paramView.findViewById(com.tencent.mm.i.aoA));
      localgh2.eoy = ((MaskLayout)paramView.findViewById(com.tencent.mm.i.aoy));
      localgh2.egA = ((TextView)paramView.findViewById(com.tencent.mm.i.aoD));
      localgh2.jAE = ((TextView)paramView.findViewById(com.tencent.mm.i.aow));
      paramView.setTag(localgh2);
      localgh1 = localgh2;
      if ((a)getItem(paramInt - 1) != null)
        break label293;
      str = "";
      locala = (a)getItem(paramInt);
      if (paramInt != 0)
        break label305;
      localgh1.egz.setVisibility(0);
      localgh1.egz.setText(qA(paramInt));
      localgh1.egz.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      localTextView1 = localgh1.egA;
      if (y.dP(locala.getUsername()))
        break label372;
    }
    label293: label305: label372: for (ColorStateList localColorStateList = this.jCp; ; localColorStateList = this.jCq)
    {
      localTextView1.setTextColor(localColorStateList);
      c.a((ImageView)localgh1.eoy.getContentView(), locala.getUsername(), true);
      localgh1.jAE.setVisibility(8);
      localgh1.eoy.setVisibility(0);
      TextView localTextView2 = localgh1.egA;
      localTextView2.setText(com.tencent.mm.ar.b.g(this.context, locala.od(), (int)localgh1.egA.getTextSize()));
      localgh1.egA.setVisibility(0);
      return paramView;
      localgh1 = (gh)paramView.getTag();
      break;
      str = qA(paramInt - 1);
      break label113;
      if ((paramInt > 0) && (!qA(paramInt).equals(str)))
      {
        localgh1.egz.setVisibility(0);
        localgh1.egz.setText(qA(paramInt));
        localgh1.egz.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        break label161;
      }
      localgh1.egz.setVisibility(8);
      break label161;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.gg
 * JD-Core Version:    0.6.2
 */