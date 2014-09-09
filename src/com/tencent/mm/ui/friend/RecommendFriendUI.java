package com.tencent.mm.ui.friend;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.aa;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.jc;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;
import java.util.LinkedList;
import junit.framework.Assert;

public class RecommendFriendUI extends MMActivity
  implements m
{
  private ProgressDialog dWT = null;
  private int dWV = -1;
  private ListView eoh;
  private TextView fIm;
  private LinkedList jID = new LinkedList();
  private boolean jIE;
  private bc jJf;
  private LinkedList jJg = new LinkedList();
  private boolean jJh = false;

  private void aYG()
  {
    this.fIm.setVisibility(0);
    this.eoh.setVisibility(8);
  }

  private void aYH()
  {
    if (this.dWV == 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("dealGetInviteFriendGroupSuccess just only qq", bool);
      z.i("!44@/B4Tb64lLpIsKKY/xHp2FOssnieKalTqmWywoHo91qQ=", "dealGetInviteFriendGroupSuccess  respList.size:" + this.jID.size());
      this.jJf.V(this.jID);
      this.eoh.setAdapter(this.jJf);
      eC(false);
      this.jIE = true;
      oP(n.cfI);
      this.jJf.fM(this.jIE);
      this.jJf.notifyDataSetChanged();
      return;
    }
  }

  private void goBack()
  {
    if (this.dWV != 0)
    {
      finish();
      return;
    }
    if ((this.jIE) || (this.jJh))
    {
      finish();
      return;
    }
    aYH();
  }

  private void qG(int paramInt)
  {
    z.i("!44@/B4Tb64lLpIsKKY/xHp2FOssnieKalTqmWywoHo91qQ=", "dealGetInviteFriendSuccess  respList.size:" + this.jJg.size());
    this.jJf.a(this.jJg, paramInt);
    this.eoh.setAdapter(this.jJf);
    this.jIE = false;
    Object localObject1;
    int i;
    if (this.dWV == 0)
    {
      localObject1 = "";
      i = 0;
      if (i < this.jID.size())
        if (paramInt != ((jc)this.jID.get(i)).iaa)
          break label145;
    }
    label145: for (Object localObject2 = ((jc)this.jID.get(i)).iab; ; localObject2 = localObject1)
    {
      i++;
      localObject1 = localObject2;
      break;
      Bt((String)localObject1);
      this.jJf.fM(this.jIE);
      this.jJf.notifyDataSetChanged();
      return;
    }
  }

  protected final void DP()
  {
    this.fIm = ((TextView)findViewById(i.arF));
    if (this.dWV == 1)
    {
      oP(n.cgI);
      this.fIm.setText(n.cgK);
    }
    while (true)
    {
      this.jJf = new bc(getLayoutInflater());
      this.eoh = ((ListView)findViewById(i.ayN));
      this.eoh.setOnItemClickListener(new cc(this));
      this.eoh.setAdapter(this.jJf);
      a(0, getString(n.bPf), new cd(this));
      eC(false);
      this.jJh = true;
      aa localaa = new aa(this.dWV);
      bg.qX().d(localaa);
      ActionBarActivity localActionBarActivity = aPI();
      getString(n.buo);
      this.dWT = e.a(localActionBarActivity, getString(n.bPi), true, new ci(this, localaa));
      a(new cg(this));
      new ch(this);
      return;
      if (this.dWV == 2)
      {
        oP(n.cgH);
        this.fIm.setText(n.cgJ);
      }
      else
      {
        oP(n.cfI);
        this.fIm.setText(n.cgL);
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpIsKKY/xHp2FOssnieKalTqmWywoHo91qQ=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramx.getType() != 135))
    {
      aYG();
      return;
    }
    this.jJg = ((aa)paramx).zv();
    this.jID = ((aa)paramx).zw();
    this.jJh = false;
    if (this.jJg.size() <= 0)
    {
      aYG();
      return;
    }
    if ((this.dWV == 0) && (this.jID.size() <= 0))
    {
      aYG();
      return;
    }
    if (this.dWV != 0)
    {
      qG(-1);
      return;
    }
    aYH();
  }

  protected final int getLayoutId()
  {
    return k.bgR;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dWV = Integer.parseInt(getIntent().getStringExtra("recommend_type"));
    this.jIE = false;
    bg.qX().a(135, this);
    DP();
  }

  protected void onDestroy()
  {
    bg.qX().b(135, this);
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.RecommendFriendUI
 * JD-Core Version:    0.6.2
 */