package com.tencent.mm.ui.contact;

import android.content.Context;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.q.aa;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.base.MaskLayout;

public class BizContactEntranceView extends RelativeLayout
{
  private View eyn = null;
  private View jye;
  private TextView jyf;
  private int jyg = 0;
  private boolean jyh;
  private Context mContext;

  public BizContactEntranceView(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    init();
    aWP();
  }

  public BizContactEntranceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    init();
    aWP();
  }

  public BizContactEntranceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    init();
    aWP();
  }

  private void aWP()
  {
    long l = System.currentTimeMillis();
    int i = ch.a((Integer)bg.qW().oQ().get(221185), 0);
    this.jyg = i;
    int k;
    int i2;
    if (this.jyg != 17)
    {
      k = bg.qW().oT().aIu();
      com.tencent.mm.q.m localm = aa.uY();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("select count(bizinfo.username").append(")");
      localStringBuilder.append(" from rcontact, bizinfo");
      localStringBuilder.append(" where rcontact.username").append(" = bizinfo.username");
      localStringBuilder.append(" and (rcontact.verifyFlag").append(" & ").append(com.tencent.mm.storage.i.aIi()).append(") != 0 ");
      localStringBuilder.append(" and (rcontact.type").append(" & 1) != 0 ");
      localStringBuilder.append(" and bizinfo.type").append(" = 1");
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localStringBuilder.toString();
      z.d("!32@/B4Tb64lLpJBvWFKDfNn3fDJZ/Q78pVI", "getServiceBizCount, %s", arrayOfObject2);
      Cursor localCursor = localm.rawQuery(localStringBuilder.toString(), new String[0]);
      if (localCursor == null)
        break label427;
      if (!localCursor.moveToFirst())
        break label421;
      i2 = localCursor.getInt(0);
      localCursor.close();
    }
    label409: label415: label421: label427: for (int m = i2; ; m = 0)
    {
      int n;
      int i1;
      label242: View localView;
      if (m > 0)
      {
        n = 16;
        if (k - m <= 0)
          break label409;
        i1 = 1;
        this.jyg = (i | i1 + n);
        if (this.jyg != i)
          bg.qW().oQ().set(221185, Integer.valueOf(this.jyg));
        Object[] arrayOfObject3 = new Object[3];
        arrayOfObject3[0] = Integer.valueOf(k);
        arrayOfObject3[1] = Integer.valueOf(m);
        arrayOfObject3[2] = Integer.valueOf(this.jyg);
        z.d("!44@/B4Tb64lLpJcZAIZpKXu2mTdFdAbI/Q60cydqQUhVTI=", "biz contact Count, %d, %d, %d", arrayOfObject3);
        localView = this.jye;
        if ((0x10 & this.jyg) != 0)
          break label415;
      }
      for (int j = 8; ; j = 0)
      {
        localView.setVisibility(j);
        if ((0x10 & this.jyg) != 0)
          bg.qQ().n(new ah(this));
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Long.valueOf(System.currentTimeMillis() - l);
        z.d("!44@/B4Tb64lLpJcZAIZpKXu2mTdFdAbI/Q60cydqQUhVTI=", "setStatus time: %d", arrayOfObject1);
        return;
        n = 0;
        break;
        i1 = 0;
        break label242;
      }
      i2 = 0;
      break;
    }
  }

  private void init()
  {
    this.jyh = false;
    View.inflate(getContext(), k.bbO, this);
    this.eyn = findViewById(com.tencent.mm.i.aoI);
    this.jye = this.eyn.findViewById(com.tencent.mm.i.ajq);
    this.eyn.setOnClickListener(new af(this));
    this.jye.setOnTouchListener(new ag(this));
    MaskLayout localMaskLayout = (MaskLayout)this.jye.findViewById(com.tencent.mm.i.ajp);
    ImageView localImageView = (ImageView)localMaskLayout.getContentView();
    com.tencent.mm.n.af.sh();
    localImageView.setImageBitmap(com.tencent.mm.n.m.eW("service_officialaccounts"));
    this.jyf = ((TextView)localMaskLayout.findViewById(com.tencent.mm.i.aST));
  }

  public final void UW()
  {
    aWP();
    setVisible(true);
  }

  public final void setVisible(boolean paramBoolean)
  {
    z.d("!44@/B4Tb64lLpJcZAIZpKXu2mTdFdAbI/Q60cydqQUhVTI=", "setVisible visible = " + paramBoolean);
    View localView = this.eyn;
    if ((paramBoolean) && (this.jyg != 0));
    for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.BizContactEntranceView
 * JD-Core Version:    0.6.2
 */