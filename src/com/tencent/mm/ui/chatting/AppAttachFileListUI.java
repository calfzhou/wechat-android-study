package com.tencent.mm.ui.chatting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.ba;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppAttachFileListUI extends MMActivity
  implements ay
{
  private AbsListView.OnScrollListener gnc = new j(this);
  private AdapterView.OnItemClickListener goF = new i(this);
  private ArrayList jlG;
  private ListView jlH;
  private l jlI;
  private boolean jlJ = true;
  private boolean jlK = false;
  private View jlL;

  private m D(ar paramar)
  {
    com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(paramar.getContent());
    if (localb == null)
      return null;
    m localm = new m(this, (byte)0);
    localm.cMM = paramar;
    localm.jlN = localb;
    return localm;
  }

  private void ba(List paramList)
  {
    if (paramList.size() < 20)
    {
      this.jlJ = false;
      this.jlH.removeFooterView(this.jlL);
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      m localm = D((ar)localIterator.next());
      if ((localm != null) && (localm.jlN.type == 6))
        this.jlG.add(localm);
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramList.size());
    arrayOfObject[1] = Integer.valueOf(this.jlG.size());
    z.d("!44@/B4Tb64lLpKndQxFPEClvZ8VNQkxuaR5yXnPRtm8QDc=", "append file item list size %d, current total size is %d", arrayOfObject);
  }

  public final void a(aw paramaw, ba paramba)
  {
    if ("insert".equals(paramba.ikc))
    {
      z.d("!44@/B4Tb64lLpKndQxFPEClvZ8VNQkxuaR5yXnPRtm8QDc=", "reveive a msg");
      for (int i = -1 + paramba.ikd.size(); i >= 0; i--)
      {
        ar localar = (ar)paramba.ikd.get(i);
        if (localar.aJu())
        {
          m localm = D(localar);
          if ((localm != null) && (localm.jlN.type == 6))
            this.jlG.add(0, localm);
        }
      }
      if (this.jlI != null)
        this.jlI.notifyDataSetChanged();
    }
  }

  protected final int getLayoutId()
  {
    return k.baO;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.bIY);
    a(new h(this));
    this.jlH = ((ListView)findViewById(com.tencent.mm.i.atu));
    this.jlL = getLayoutInflater().inflate(k.baM, null);
    this.jlH.addFooterView(this.jlL);
    this.jlL.setVisibility(8);
    this.jlG = new ArrayList();
    String str = x.pG();
    ba(bg.qW().oV().p(str, 0, 20));
    this.jlI = new l(this, (byte)0);
    this.jlH.setAdapter(this.jlI);
    this.jlH.setOnItemClickListener(this.goF);
    this.jlH.setOnScrollListener(this.gnc);
    bg.qW().oV().a(this, getMainLooper());
  }

  protected void onDestroy()
  {
    bg.qW().oV().a(this);
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppAttachFileListUI
 * JD-Core Version:    0.6.2
 */