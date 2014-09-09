package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.g.a;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GroupCardSelectUI extends MMActivity
{
  private TextView ekL;
  private List fpG;
  private boolean jAa;
  private ListView jAb;
  private cw jAc;
  private HashMap jAd;
  private boolean jzZ = true;

  private void a(int paramInt, com.tencent.mm.storage.i parami, long paramLong)
  {
    for (int i = 0; (i < paramInt) && (paramLong <= ((Long)this.jAd.get(((com.tencent.mm.storage.i)this.fpG.get(i)).getUsername())).longValue()); i++);
    this.fpG.add(i, parami);
  }

  protected final void DP()
  {
    this.jAb = ((ListView)findViewById(com.tencent.mm.i.axc));
    this.jAc = new cw(this);
    this.jAb.setAdapter(this.jAc);
    this.jAb.setOnItemClickListener(new cu(this));
    this.ekL = ((TextView)findViewById(com.tencent.mm.i.awY));
    if (this.jAc.getCount() <= 0)
      this.ekL.setVisibility(0);
    while (true)
    {
      a(new cv(this));
      return;
      this.ekL.setVisibility(8);
    }
  }

  protected final int getLayoutId()
  {
    return k.bgA;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bt(getString(n.bsq));
    this.jzZ = getIntent().getBooleanExtra("group_select_type", true);
    this.jAa = getIntent().getBooleanExtra("group_select_need_result", false);
    this.jAd = bg.qW().oW().aIE();
    this.fpG = new LinkedList();
    List localList = y.qk();
    int i;
    if (localList.size() != 0)
    {
      Iterator localIterator = localList.iterator();
      i = 0;
      while (localIterator.hasNext())
      {
        com.tencent.mm.storage.i locali = (com.tencent.mm.storage.i)localIterator.next();
        if (!this.jAd.containsKey(locali.getUsername()))
        {
          if (!a.cv(locali.getType()))
            break label202;
          this.fpG.add(locali);
        }
        else
        {
          a(i, locali, ((Long)this.jAd.get(locali.getUsername())).longValue());
        }
      }
    }
    label202: for (int j = i + 1; ; j = i)
    {
      i = j;
      break;
      localList.clear();
      DP();
      return;
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  protected void onPause()
  {
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.GroupCardSelectUI
 * JD-Core Version:    0.6.2
 */