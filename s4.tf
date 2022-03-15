resource "aws_sns_topic" "example1" {
  kms_master_key_id = "value"
  tags              = {
    Environment = "dev"
    Owner       = "apps-team"
  }
}

resource "aws_sns_topic" "example2" {

}

resource "aws_sns_topic" "example3" {
  kms_master_key_id = "value"
  tags              = {
    Environment = "dev"
    Owner       = "apps-team"
  }
}
