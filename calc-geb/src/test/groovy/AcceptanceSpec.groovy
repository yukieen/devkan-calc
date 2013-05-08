import geb.spock.GebSpec

class AcceptanceSpec extends GebSpec {

    def "テスト環境の確認"() {
        when: go "http://google.co.jp"
        then: title == "Google"
    }
}