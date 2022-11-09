//
//  ModelData.swift
//  TutorialLandmarks
//
//  Created by haksung on 2022/11/04.
//

import Foundation
import Combine

final class ModelData: ObservableObject{
    @Published var landmarks: [Landmark] = getLandmarks()
    var hikes: [Hike] = load("hikeData.json")
    
    var features: [Landmark] {
        landmarks.filter { $0.isFeatured }
    }
    
    var categories: [String: [Landmark]] {
        Dictionary(
            grouping: landmarks,
            by: { $0.category.rawValue }
        )
    }
}

func load<T: Decodable>(_ filename: String) -> T {
    let data: Data
    
    guard let file = Bundle.main.url(forResource: filename, withExtension: nil)
    else {
        fatalError("Couldn't find \(filename) in main bundle.")
    }
    
    do {
        data = try Data(contentsOf: file)
    }catch {
        fatalError("Couldn't load \(filename) from main bundle:\n\(error)")
    }
    
    do {
        let decoder = JSONDecoder()
        return try decoder.decode(T.self, from: data)
    }catch {
        fatalError("Couldn't parse \(filename) as \(T.self):\n\(error)")
    }
}

func getLandmarks<T: Codable>() -> T{
    let url = URL(string: "http://localhost:8080/landmarks")
    var response:String
    do {
        response = try String(contentsOf: url!)
    }catch{ fatalError("Invalid URL!") }
    
    do {
        let decoder = JSONDecoder()
        return try decoder.decode(T.self, from: response.data(using: .utf8)!)
    }catch{
        fatalError("Could not decode")
    }
    
}

func putLandmark(paramText: Landmark) -> Void {
    
    do {
        // paramText를 데이터 형태로 변환
        let encoder = JSONEncoder()
        var paramData: Data
        do {
            paramData = try encoder.encode(paramText)
        }catch {
            fatalError("check input data")
        }
        
        // URL 객체 정의
        let url = URL(string: "http://localhost:8080/landmark")
        
        // URL Request 객체 정의
        var request = URLRequest(url: url!)
        request.httpMethod = "PUT"
        request.httpBody = paramData
        
        // HTTP 메시지 헤더
        request.addValue("application/json", forHTTPHeaderField: "Content-Type")
//        request.setValue(String(paramData.count), forHTTPHeaderField: "Content-Length")
        
        // URLSession 객체를 통해 전송, 응답값 처리
        let task = URLSession.shared.dataTask(with: request) { (data, response, error) in
            // 서버가 응답이 없거나 통신이 실패
            if let e = error {
                NSLog("An error has occured: \(e.localizedDescription)")
                return
            }
            
            // 응답 처리 로직
            DispatchQueue.main.async() {
                // 서버로부터 응답된 스트링 표시
                let outputStr = String(data: data!, encoding: String.Encoding.utf8)
                print("result: \(outputStr!)")
            }
        }
        // POST 전송
        task.resume()
    }
    
}
