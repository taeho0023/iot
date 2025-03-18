int Vo = A0;
int V_LED = 12;

float Vo_vaLue=0;

void setup() {
  Serial.begin(9600);
  pinMode(V_LED, OUTPUT);
  pinMode(Vo, INPUT);
}

void loop()
{
  digitalWrite(V_LED,LOW);
  delayMicroseconds(280);
  Vo_vaLue = analogRead(Vo);
  delayMicroseconds(40);
  digitalWrite(V_LED,HIGH);
  delayMicroseconds(9680);
  Serial.print("dust=");
  Serial.println(Vo_vaLue);
  delay(1000);
}

